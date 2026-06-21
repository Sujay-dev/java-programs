package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class Reverse {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(101, "Sujay");
        map.put(102, "Vedant");
        map.put(103, "Rohan");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();

        for (var s : map.entrySet()) {
            map2.put(s.getValue(), s.getKey());
        }

        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
