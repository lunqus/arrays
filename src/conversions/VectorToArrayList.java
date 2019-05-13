package conversions;

import java.util.ArrayList;
import java.util.Vector;

public class VectorToArrayList {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.add("B");
        vector.add("A");

        ArrayList<String> arrayList = new ArrayList<>(vector);
        System.out.println(arrayList);
    }
}
