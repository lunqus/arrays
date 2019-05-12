package swapElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTwoElementsInArrayList {

    public static void main(String[] args) {

        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("a","b","c","d"));

        Collections.swap(strArray, 1,2);

        System.out.println(strArray);
    }
}
