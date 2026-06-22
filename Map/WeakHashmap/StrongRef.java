package Maps.WeakHashmap;

import java.util.WeakHashMap;

public class StrongRef {
    public static void main(String[] args) {
        WeakHashMap<Integer,String> map=new WeakHashMap<>();
        map.put(101, "User 1");
        map.put(102, "User 2");
        map.put(103, "User 3");

        System.out.println(map);

        map.get(map.keySet());
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(map);
    }
}
