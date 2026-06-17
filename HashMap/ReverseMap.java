package HashMap;

import java.util.HashMap;

public class ReverseMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101, "Sujay");
        map.put(102, "Vedant");
        map.put(103, "Rohan");

        HashMap<String,Integer> map2=new HashMap<>();

        for (var s : map.entrySet()) {
            map2.put(s.getValue(), s.getKey());
        }

        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
