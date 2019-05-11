package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeArrayListOfStrings {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Jonas");
        names.add("Petras");
        names.add("Zigmas");

        try {
            FileOutputStream fos = new FileOutputStream("nameData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(names);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
