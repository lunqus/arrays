package removeElements;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFromArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jonas", "Petras", "Zigmas", "Mantas", "Jonas"));

        names.remove(3);
        names.remove("Jonas");

        System.out.println(names);

        // Remove all elements by specified value using JAVA 8 Stream
        ArrayList<String> nameArr = new ArrayList<>(Arrays.asList("Jonas", "Petras", "Zigmas", "Mantas", "Jonas"));

        nameArr.removeIf(name -> name.equals("Jonas"));
        System.out.println(nameArr);
    }
}
