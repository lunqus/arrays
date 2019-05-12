package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeArrayListOfStrings {

    public static void main(String[] args) {

        ArrayList<String> deList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("nameData");
            ObjectInputStream ois = new ObjectInputStream(fis);

            deList = (ArrayList) ois.readObject();

            ois.close();
            fis.close();

            } catch (IOException e ) {
                e.printStackTrace();
                } catch (ClassNotFoundException c) {
                    c.printStackTrace();
        }

        for (String name : deList)
            System.out.println(name);
    }
}
