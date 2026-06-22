package Maps.IdentityMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Product {
    public static void main(String[] args) {
        String s1=new String("123456");
        String s2=new String("123456");
        String s3=new String("123456");

        HashMap<Object,String> map=new HashMap<>();

        map.put(s1, "Product 1");
        map.put(s2, "Product 2");
        map.put(s3, "Product 3");

        System.out.println(map.size());

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        IdentityHashMap<Object,String> map2=new IdentityHashMap<>();

        map2.put(s1, "Product 1");
        map2.put(s2, "Product 2");
        map2.put(s3, "Product 3");

        System.out.println(map2.size());

        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
