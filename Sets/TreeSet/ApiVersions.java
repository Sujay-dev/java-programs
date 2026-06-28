package Sets.TreeSet;

import java.util.TreeSet;

public class ApiVersions {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println("Sorted Versions: " + set);
        System.out.println("Highest Version: " + set.last());
        System.out.println("Lowest Version: " + set.first());
        System.out.println("Does version 3 exist: " + set.contains(3));
    }
}
