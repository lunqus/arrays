package splitingString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

    public static void main(String[] args) {

        String numbers = "22,11,33,447,525,668,87,433,234,44";
        String[] num = numbers.split(",");
        String comma = ", ";

        List numArray = new ArrayList();
        numArray = Arrays.asList(num);

        int i = 0;
        for (Object el: numArray) {
            if(i == numArray.size()-1) comma = ".";
            System.out.print(el + comma);
            i++;
        }

        System.out.println("\n----------\n");

        String symbols = "fdss sgfsgs  fdshds dfsghfdsg  ,  % , fdgdfsg > fdgsfdgfds";
        symbols = symbols.trim();
        symbols = symbols.replaceAll("( )+", " ");
        String[] sym = symbols.split(" ");

        List strArray = new ArrayList();
        strArray = Arrays.asList(sym);


        int j = 0;
        for (Object str : strArray) {
            comma = ", ";
            if(j == strArray.size()-1) comma = ".";
            System.out.print(str + comma);
            j++;
        }
    }
}
