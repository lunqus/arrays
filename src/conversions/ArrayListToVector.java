package conversions;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListToVector {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("O");
        arrayList.add("O");
        arrayList.add("L");

        Vector<String> vector = new Vector<>(arrayList);
        for (String v : vector)
            System.out.print(v);
    }
}
