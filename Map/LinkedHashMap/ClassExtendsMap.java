package Maps.LinkedHashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassExtendsMap<K,V> extends LinkedHashMap<K,V>{
    private int capacity;

    public ClassExtendsMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
        ClassExtendsMap<String ,Integer> map=new ClassExtendsMap<>(3);
        map.put("Sujay", 82);
        map.put("Vedant", 63);
        map.put("Rohan", 68);
       // map.get("Sujay"); if we do this then vedant will be eldest and get removed;
        map.put("Suyash", 67);// after this sujay get removed and suyash get added because capapcity is 3;

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
