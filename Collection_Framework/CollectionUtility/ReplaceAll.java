package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceAll {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Sql");
        list.add("Spring");
        list.add("Java");
        list.add("Spring");
        list.add("Java");

        System.err.println("List: " + list);

        Collections.replaceAll(list, "Java", "Python");

        System.out.println("\nReplaced List: " + list);
    }
}
