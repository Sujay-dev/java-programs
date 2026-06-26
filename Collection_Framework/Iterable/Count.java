package CollectionFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Count {
        public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Sql");
        list.add("Docker");
        list.add("Reddis");

        int count=0;

        Iterator<String> it=list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            count++;
        }
        System.out.println("Total Elements: " + count);
    }
}
