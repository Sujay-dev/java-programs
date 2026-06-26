package Maps.Concurrentmap;

import java.util.EnumMap;
import java.util.Map;

enum Role {
    ADMIN,
    USER,
    GUEST
}
public class EnumEx {
    public static void main(String[] args) {
        Map<Role,String> map=new EnumMap<>(Role.class);

        map.put(Role.ADMIN, "Full Access");
        map.put(Role.USER, "Limited Access");
        map.put(Role.GUEST, "Read Only");

        for (var s : map.keySet()) {
            System.out.println(s);
        }

        System.out.println();

        for (String s : map.values()) {
            System.out.println(s);
        }

        System.out.println();
        
        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        System.out.println("Permisssion of Admin: " + map.get(Role.ADMIN));
        System.out.println("Permission of User: " + map.get(Role.USER));

        System.out.println();

        System.out.println("Conatains : " + map.containsKey(Role.GUEST));
        System.out.println("Conatains : " + map.containsValue("Read Only"));
    }
}
