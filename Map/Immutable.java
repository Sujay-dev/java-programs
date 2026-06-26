package Maps.Concurrentmap;

import java.util.Map;

public class Immutable {
    public static void main(String[] args) {
        Map<Integer,String> map=Map.of(1, "Java",2,"Spring",3,"Sql",4,"Docker");

        for (Integer s : map.keySet()) {
            System.out.println(s);
        }

        System.out.println();

        for (String s : map.values()) {
            System.out.println(s);
        }

        System.out.println();

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }

        System.out.println(map.get(2));
        //map.put(5, "Reddis");//Throws Exception

        System.out.println();

        if (map.containsKey(3)) {
            System.out.println("Found: "+ map.get(3));
        }else{
            System.out.println("Not Found");
        }

        System.out.println();

        if (map.containsValue("Sql")) {
            System.out.println("Found: ");
        }else{
            System.out.println("Not Found");
        }

        System.out.println();

        if (map.containsKey(10)) {
            System.out.println("Found: " + map.get(10));
        }else{
            System.out.println("Not Found");
        }

        System.out.println();

        Map<String,Integer> map2=Map.of("SUCCESS", 200, "CREATED", 201,"BAD_REQUEST",400,"UNAUTHORIZED",401,"NOT_FOUND",404,"INTERNAL_SERVER_ERROR",500);

        System.out.println("Ststus code of NOT_FOUND: " + map2.get("NOT_FOUND"));
        System.out.println("Status code of SUCCESS: " + map2.get("SUCCESS"));

        map2.replace("SUCCESS", 999);
        System.out.println("Status code of SUCCESS: " + map2.get("SUCCESS"));

    }
}
