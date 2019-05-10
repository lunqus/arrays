package removeElements;

import java.util.ArrayList;
import java.util.Arrays;

public class clearArrayList {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>(Arrays.asList("A", "B", "C", "R", "O"));

        stringArr.clear();
        System.out.println(stringArr);

        ArrayList<String> newStringArr = new ArrayList<>(Arrays.asList("A", "B", "C", "R", "O"));

        newStringArr.removeAll(newStringArr);
        System.out.println(newStringArr);

    }
}
