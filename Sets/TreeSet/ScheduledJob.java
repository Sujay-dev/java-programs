package Sets.TreeSet;

import java.util.TreeSet;

public class ScheduledJob {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();

        set.add(45);
        set.add(10);
        set.add(60);
        set.add(20);
        set.add(45);
        set.add(30);

        System.out.println(set);
        System.out.println("First Job: " + set.first());
        System.out.println("Last Job: " + set.last());
        System.out.println("First job after 25: " + set.ceiling(25));
        System.out.println("Last job before 25: " + set.floor(25));
    }
}
