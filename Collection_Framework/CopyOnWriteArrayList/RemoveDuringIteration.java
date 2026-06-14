package CollectionFramework.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveDuringIteration {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);

        System.out.println(list);

        for (Integer i : list) {
            System.out.println(i);
            if (i==20) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
