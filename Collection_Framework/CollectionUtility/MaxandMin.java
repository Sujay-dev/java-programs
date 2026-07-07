package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;

public class MaxandMin {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(70);
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(120);
        list.add(100);
        list.add(11);
        list.add(4);
        list.add(103);
        list.add(23);
        list.add(54);
        list.add(43);

        System.out.println("List: " + list);

        Integer max=Collections.max(list);

        System.out.println("\nLargest number: " + max);

        Integer min=Collections.min(list);

        System.out.println("\nSmallest number: " + min);

        
    }
}
