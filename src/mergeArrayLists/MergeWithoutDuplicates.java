package mergeArrayLists;

import java.util.*;

public class MergeWithoutDuplicates {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c","r"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("a","b","c","k"));

        // LinkedHashSet allow only unique elements
        Set<String> set = new LinkedHashSet<>(arr1);
        set.addAll(arr2);
        List<String> combined = new ArrayList<>(set);
        System.out.println(set);

        // Remove all elements of arr1 from arr2, and the add arr1 to arr2
        // List<String> arr2Copy = new ArrayList<>(arr2);
        arr2.removeAll(arr1);
        arr1.addAll(arr2);
        System.out.println(arr1);
    }
}
