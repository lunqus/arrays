package modifyListElements;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ModifyListElements {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        strList.add("LT0010001345");
        strList.add("LT001145");
        strList.add("DE00135");
        strList.add("LT00111456");

        ListIterator<String> iterator = strList.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            char[] elChar = element.toCharArray();
            stringBuilder.append(elChar[0]);
            stringBuilder.append(elChar[1]);

            for (int i = 2; i < elChar.length; i++) {
                if(elChar[i] == '0' && elChar[i-1] != '0') stringBuilder.append(" (" + elChar[i]);
                else if(elChar[i] == '0' && elChar[i-1] == '0' && elChar[i-2] != '0') stringBuilder.append(elChar[i] + ") ");
                else stringBuilder.append(elChar[i]);
            }

            element = stringBuilder.toString();
            iterator.set(element);
        }

        for (String str : strList)
            System.out.println(str);

    }
}
