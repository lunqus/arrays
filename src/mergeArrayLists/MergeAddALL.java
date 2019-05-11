package mergeArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeAddALL {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a","b","c","d"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a","c","r","l"));

        listOne.addAll(listTwo);
        System.out.println(listOne);
    }
}
