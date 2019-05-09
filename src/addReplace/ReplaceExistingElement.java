package addReplace;

import java.util.ArrayList;

public class ReplaceExistingElement {

    public static void main(String[] args) {

        ArrayList listArr = new ArrayList<String>();

        listArr.add("A");
        listArr.add("B");
        listArr.add("C");
        listArr.add("D");

        int index = listArr.indexOf("C");

        listArr.set(index, "c");
        System.out.println(listArr);

        listArr.set(listArr.indexOf("D"), "d");
        System.out.println(listArr);
    }
}
