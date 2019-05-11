package removeDuplicateElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesJava8 {

    public static void main(String[] args) {

        ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(
                1,3,5,6,8,9,12,12,12,13,18,23,24,5,7,7,7,10
        ));

        List<Integer> numArrayWithoutDuplicates =
                numArray.stream().distinct().collect(Collectors.toList());

        Collections.sort(numArrayWithoutDuplicates); // Optional, but sorting

        System.out.println(numArrayWithoutDuplicates);
    }
}
