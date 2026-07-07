package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(45);
        list.add(10);
        list.add(80);
        list.add(60);
        list.add(25);
        list.add(5);
        list.add(90);

        System.out.println("List: " + list);

        Collections.sort(list);

        System.out.println("\nSorted List: " + list);

        Integer search1=Collections.binarySearch(list, 60);

        System.out.println("\n60 found at index: " + search1);

        Integer search2=Collections.binarySearch(list, 80);

        System.out.println("\n80 found at index: " + search2);
    }
}
