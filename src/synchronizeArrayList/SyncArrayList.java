package synchronizeArrayList;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrayList {

    public static void main(String[] args) {

        List<String> names = Collections.synchronizedList(Arrays.asList("time", "name", "anyword", "whatsup"));

//            names.add("brother");
//            names.add("matrix");

        synchronized (names) {
            Iterator<String> iterator = names.iterator();
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }

        CopyOnWriteArrayList<String> namesList = new CopyOnWriteArrayList<>();

        namesList.add("Jonas");
        namesList.add("Kestas");

        Iterator<String> it = namesList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
