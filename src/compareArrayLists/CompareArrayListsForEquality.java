package compareArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CompareArrayListsForEquality {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a","g","c","b"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a","b","c","h"));

        Collections.sort(listOne);
        Collections.sort(listTwo);

        /**
         *      List.equals() return true if both elements are of same size
         *      and both contains same set elements in exatly order
         * */

        // Unequal Lists comparison
        boolean isEqual = listOne.equals(listTwo);
        System.out.println(isEqual);

        // Equals Lists comparison
        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("a","b","g","c"));
        Collections.sort(listThree);
        isEqual = listOne.equals(listThree);
        System.out.println(isEqual);
    }
}
