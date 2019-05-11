package compareArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAdditionalElements {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("q","w","e","t","y","e","q"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("q","w","e","t","z"));

        // Removes all elements from first List which exists in second
        listOne.removeAll(listTwo);
        System.out.println(listOne);

    }
}
