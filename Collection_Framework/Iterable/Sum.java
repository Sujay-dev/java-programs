package CollectionFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        int sum=0;

        Iterator<Integer> it=list.iterator();

        while (it.hasNext()) {
            sum+=it.next();
        }
        System.out.println("Sum of elements is: " + sum);
    }
}
