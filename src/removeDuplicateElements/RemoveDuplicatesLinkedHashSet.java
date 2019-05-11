package removeDuplicateElements;

import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesLinkedHashSet {

    public static void main(String[] args) {

        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,6,7,8,8,8,9,9,10));

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(intArray);

        ArrayList<Integer> intArrayWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println(intArrayWithoutDuplicates);
    }
}
