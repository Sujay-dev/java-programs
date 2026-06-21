package Maps.WeakHashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapvsWeakMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        WeakHashMap<String,String> map2=new WeakHashMap<>();

        String k1=new String("Sujay");
        String k2=new String("Vedant");
        String k3=new String("Rohan");

        map2.put(k1, "Backend");
        map2.put(k2, "Frontend");
        map2.put(k3, "DataBase");
        
        map.put(k1, "Backend");
        map.put(k2, "Frontend");
        map.put(k3, "DataBase");

        

        System.out.println(map);

        System.out.println(map2);

        k2=null;

        System.gc();

        System.out.println("Wait for 10 sec...");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {

        }

        System.out.println(map);
        System.out.println(map2);
    }
}