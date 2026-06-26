package Maps.Concurrentmap;

import java.util.EnumMap;
import java.util.Map;

enum HttpMethod {
    GET,
    POST,
    PUT,
    DELETE
}
public class EnumHttp {
    public static void main(String[] args) {
        Map<HttpMethod,String> map=new EnumMap<>(HttpMethod.class);

        map.put(HttpMethod.GET, "Read Data");
        map.put(HttpMethod.POST, "Create Data");
        map.put(HttpMethod.PUT, "Update Data");
        map.put(HttpMethod.DELETE, "Remove Data");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        System.out.println("Operation of GET: " +map.get(HttpMethod.GET));
        System.out.println("Operation of DELETE: " + map.get(HttpMethod.DELETE));

        System.out.println();
        
        map.replace(HttpMethod.PUT, "Modify Data");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
