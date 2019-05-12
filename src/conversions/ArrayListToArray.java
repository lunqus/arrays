package conversions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {

        // Convert ArrayList to Array - List.toArray()
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("how");
        arrayList.add("to");
        arrayList.add("do");
        arrayList.add("in");
        arrayList.add("java");

        String[] strArr = arrayList.toArray(new String[arrayList.size()]);

        System.out.println(Arrays.toString(strArr));

        // Convert ArrayList to Array - Java 8 stream

        String[] stringArr = arrayList.stream().toArray(String[]::new);

        System.out.println(Arrays.toString(stringArr));
    }
}
