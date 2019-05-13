package conversions;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);
    }
}
