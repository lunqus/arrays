package iterations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IterationsTest {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Svilnas", "Matrioska", "Salon", "Kuzia"));

        System.out.println("\n===== For Loop =====");

        // For Loop
        for (int i = 0; i < names.size(); i++) System.out.print(names.get(i) + " ");

        System.out.println("\n===== Foreach Loop =====");

        // Foreach Loop
        for (String name : names) System.out.print(name + " ");

        System.out.println("\n===== List Iterator =====");

        // List Iterator
        ListIterator listIterator = names.listIterator();
        while (listIterator.hasNext()) System.out.print(listIterator.next() + " ");

        System.out.println("\n===== While Loop =====");

        // While Loop
        int index = 0;
        while (names.size() > index) System.out.print(names.get(index++) + " ");

        System.out.println("\n===== Java 8 Stream =====");

        // Java 8 Stream
        names.forEach(name -> System.out.print(name + " "));
    }
}
