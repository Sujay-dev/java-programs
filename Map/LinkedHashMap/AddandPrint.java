package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class AddandPrint {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
        map1.put(101, "Sujay");
        map1.put(102, "Vedant");
        map1.put(103, "Rohan");

        for (var s : map1.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
