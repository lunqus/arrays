package compareArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {

    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<>(Arrays.asList("c","v","b","n","m"));
        ArrayList<String> second = new ArrayList<>(Arrays.asList("c","v","b","n","k"));

        first.retainAll(second);
        System.out.println(first);
    }
}
