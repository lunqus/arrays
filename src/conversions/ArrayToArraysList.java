package conversions;

import com.sun.javafx.collections.ImmutableObservableList;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArraysList {

    public static void main(String[] args) {

        String[] simpleArray = new String[]{"alex","brian","charles","david"};

        // Immutable ArrayList instatiated with Collections.unmodifiableList()
        List<String> listArray = Collections.unmodifiableList(Arrays.asList(simpleArray));
        System.out.println(listArray);

        // Mutable ArrayList using Arrays.asList()
        List<String> asList = new ArrayList<>(Arrays.asList(simpleArray));
        System.out.println(asList);

    }
}
