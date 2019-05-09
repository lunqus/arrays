package addReplace;

import java.util.ArrayList;
import java.util.Arrays;

public class addReplaceTest {

    public static void main(String[] args) {

        ArrayList<String> nameLIst = new ArrayList<>(Arrays.asList("Jonas","Petras","Gintas","Siams"));

        System.out.println(nameLIst);

        // Add element at 0 index
        nameLIst.add(0, "Koziol");
        System.out.println(nameLIst);

        // Replace element at 0 index
        nameLIst.set(0, "Robert");
        System.out.println(nameLIst);

        // Replace element while iterating
        for (int i = 0; i < nameLIst.size(); i++) {
            if (nameLIst.get(i).equalsIgnoreCase("Gintas")) {
                nameLIst.set(i, "Arturas");
            }
        }
        System.out.println(nameLIst);
     }
}
