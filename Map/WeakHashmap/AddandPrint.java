package Maps.WeakHashmap;

import java.util.WeakHashMap;

public class AddandPrint {
    public static void main(String[] args) {
        WeakHashMap<String,String> map=new WeakHashMap<>();
        String k1=new String("Sujay");
        String k2=new String("Vedant");
        String k3=new String("Rohan");
        map.put(k1, "Backend");
        map.put(k2, "Frontend");
        map.put(k3, "DataBase");

        System.out.println(map);

        k1=null;
       
        System.gc();

        System.out.println("Wait for 10 sec...");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        System.out.println(map);
    }
}
