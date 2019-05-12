package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArrayList {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("alex");
        hashSet.add("brian");
        hashSet.add("chaplin");
        hashSet.add("steve");

        ArrayList<String> aList = new ArrayList<>(hashSet);
        System.out.println(aList);
    }
}
