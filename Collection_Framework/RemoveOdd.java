package CollectionFramework.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveOdd {
     public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(31);
        list.add(20);
        list.add(51);

        System.out.println(list);
        
        for (Integer i : list) {
            System.out.println(i);
            if (i%2!=0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
