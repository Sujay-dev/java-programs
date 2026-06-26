package CollectionFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove {
        public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Sql");
        list.add("Docker");
        list.add("Sql");

        Iterator<String> it=list.iterator();

        while (it.hasNext()) {
            if (it.next().equals("Sql")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
