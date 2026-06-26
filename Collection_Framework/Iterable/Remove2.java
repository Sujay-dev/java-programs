package CollectionFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove2 {
       public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        list.add("juile");

        Iterator<String> it=list.iterator();

        while (it.hasNext()) {
            String ch=it.next();
            if (ch.contains("a") || ch.contains("A")) {
                System.out.println(ch);
            }
        }
        System.out.println(list);
    }
}
