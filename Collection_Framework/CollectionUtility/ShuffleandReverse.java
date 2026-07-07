package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleandReverse{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Dhoni");
        list.add("Virat");
        list.add("Rohit");
        list.add("Dhawan");
        list.add("K.L.Rahul");
        list.add("Hardik");
        list.add("Jadeja");
        list.add("Ashwin");
        list.add("Bhuvi");
        list.add("Bumrah");
        list.add("Shami");

        System.out.println("List: " + list);

        Collections.shuffle(list);

        System.out.println("\nShuffled List: " + list);

        Collections.reverse(list);

        System.out.println("\nReversed List: " + list);
    }
}