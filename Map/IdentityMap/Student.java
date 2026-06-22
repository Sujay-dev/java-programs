package Maps.IdentityMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Student {
     public static void main(String[] args) {
        String s1=new String("Sujay");
        String s2=new String("Sujay");

        HashMap<Object,String> map=new HashMap<>();
        map.put(s1, "Student 1");
        map.put(s2, "Student 2");

        System.out.println(map.size());

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        IdentityHashMap<Object,String> map1=new IdentityHashMap<>();
        map1.put(s1, "Student 1");
        map1.put(s2, "Student 2");

        System.out.println(map1.size());

        for (var s : map1.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
