package CollectionUtility;

import java.util.Collections;
import java.util.HashSet;

public class Disjoint {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<>();

        set1.add("Java");
        set1.add("Spring");
        set1.add("Sql");
        set1.add("Python");
        set1.add("Kafka");

        System.out.println("Set1: "+ set1);

        HashSet<String> set2=new HashSet<>();

        set2.add("Reddis");
        set2.add("Node");
        set2.add("React");
        set2.add("HTML");
        set2.add("JavaScript");

        System.out.println("\nSet2: "+ set2);

        System.out.println("\nCommon elements: " + Collections.disjoint(set1, set2));
    }
}
