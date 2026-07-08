package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Messi");
        list.add("Mbappe");
        list.add("Neymar Jr");
        list.add("Vini Jr");
        list.add("Haland");
        list.add("Cristiano Ronaldo");
        
        System.out.println("List: " + list);

        Collections.swap(list, 0, 5);
        Collections.swap(list, 1, 3);

        System.out.println("\nSwappend List: " + list);
    }
}
