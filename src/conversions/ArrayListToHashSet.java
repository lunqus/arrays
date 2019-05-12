package conversions;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSet {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Gerda");
        arrayList.add("Silke");
        arrayList.add("Korks");
        arrayList.add("Mente");

        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);
    }
}
