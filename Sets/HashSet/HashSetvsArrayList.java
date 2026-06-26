package Sets.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetvsArrayList {
     public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        ArrayList<String> list=new ArrayList<>();

        set.add("Java");
        set.add("Spring");
        set.add("SQL");
        set.add("Docker");
        set.add("Java");
        set.add("Spring");

        list.add("Java");
        list.add("Spring");
        list.add("SQL");
        list.add("Docker");
        list.add("Java");
        list.add("Spring");

        Iterator<String> it=set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        
        Iterator<String> it1=list.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
