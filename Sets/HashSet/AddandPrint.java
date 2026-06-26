package Sets.HashSet;

import java.util.HashSet;

public class AddandPrint {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("SQL");
        set.add("Docker");
        set.add("Java");
        set.add("Spring");

        System.out.println(set);
        System.out.println(set.size());
    }
}
