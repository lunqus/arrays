package mergeArrayLists;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeJava8 {

    public static void main(String[] args) {

        ArrayList<String> strArrOne = new ArrayList<>(Arrays.asList("a","g","t","r"));
        ArrayList<String> strArrTwo = new ArrayList<>(Arrays.asList("g","k","x","l"));

        List<String> combined = Stream.of(strArrOne, strArrTwo)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(combined);
        System.out.println("========");

        // Removing duplicates
        List<String> dublicateFree = combined.stream()
                .distinct().collect(Collectors.toList());
        Collections.sort(dublicateFree);

        System.out.println(dublicateFree);
    }
}
