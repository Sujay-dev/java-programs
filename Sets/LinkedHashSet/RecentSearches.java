package Sets.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RecentSearches {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();

        set.add("Laptop");
        set.add("Phone");
        set.add("HeadPhone");
        set.add("Laptop");
        set.add("Mouse");
        set.add("Phone");
        set.add("Keyboard");

        Iterator<String> it=set.iterator();

        System.out.println("Recent searches: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Total unique searches: " + set.size());
    }
}
