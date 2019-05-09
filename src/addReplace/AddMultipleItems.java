package addReplace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMultipleItems {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>(Arrays.asList("Sergas", "Morgas", "Henris", "Haroldas"));

        /**
         * ADD ALL ITEMS FROM ONE ARRAY LIST TO ANOTHER
         */

        // Copy from one Array List to another
        ArrayList<String> gainNames = new ArrayList<>();
        gainNames.addAll(names);
        System.out.println(gainNames);

        /**
         * ADD ONLY SELECTED ITEMS TO THE ARRAY LIST
         * USING JAVA 8 STREAM
         */

        // Skip element with value "Morgas"
        ArrayList<String> skipNames = new ArrayList<>();
        names.stream()
                .filter(name -> !name.equals("Morgas"))
                .filter(name -> !name.equals("Sergas"))
                .forEachOrdered(skipNames::add);
        System.out.println(skipNames);

    }
}
