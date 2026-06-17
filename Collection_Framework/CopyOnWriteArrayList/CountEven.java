package CollectionFramework.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CountEven {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(51);

        System.out.println(list);
        int count=0;
        for (Integer i : list) {
            if (i%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
