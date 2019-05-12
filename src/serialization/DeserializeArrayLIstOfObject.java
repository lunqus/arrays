package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeArrayLIstOfObject {

    public static void main(String[] args) {

        ArrayList<Employee> deEmployee = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("employeeData");
            ObjectInputStream ois = new ObjectInputStream(fis);

            deEmployee = (ArrayList) ois.readObject();

            ois.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        for (Employee employee : deEmployee)
            System.out.println(employee);

    }
}
