package conversions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println(linkedList);
    }
}
