package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Sql");
        list.add("Spring");
        list.add("Java");
        list.add("Spring");
        list.add("Java");
        list.add("Sql");

        System.out.println("List: " + list);

        Integer freq1=Collections.frequency(list, "Java");

        System.out.println("\nJava appeared: "+ freq1 + " times");

        Integer freq2=Collections.frequency(list, "Spring");

        System.out.println("\nSpring appeared: "+ freq2 + " times");

        Integer freq3=Collections.frequency(list, "Sql");

        System.out.println("\nSql appeared: " + freq3 + " times");
    }
}
