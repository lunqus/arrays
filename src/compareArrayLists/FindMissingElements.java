package compareArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingElements {

    public static void main(String[] args) {

        ArrayList<String> listFirst = new ArrayList<> (Arrays.asList("a", "b", "c", "d", "e"));
        ArrayList<String> listSecond = new ArrayList<> (Arrays.asList("a", "b", "c", "d", "f"));

        // Removes all elements from first List which doesn't exists in second

        listSecond.removeAll(listFirst);
        System.out.println(listSecond);
    }
}
