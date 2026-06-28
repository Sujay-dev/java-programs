package Sets.LinkedHashSet;

import java.util.LinkedHashSet;

public class AddandPrint {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();

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
