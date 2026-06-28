package Sets.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ApiEndpoints {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();

        set.add("/api/login");
        set.add("/api/users");
        set.add("/api/orders");
        set.add("/api/login");
        set.add("/api/products");
        set.add("/api/logout");

        System.out.println("endpoints: ");
        Iterator<String> it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println("/api/orders endpoint exists: " + set.contains("/api/orders"));
        set.remove("/api/login");
        System.out.println();
        System.out.println(set);
    }
}
