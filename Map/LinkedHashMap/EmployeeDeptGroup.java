package Maps.LinkedHashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class EmployeeDeptGroup {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("Sujay", "HR");
        map.put("Vedant", "IT");
        map.put("Suyash", "IT");
        map.put("Rohan", "AI");
        map.put("Athrava", "IT");
        map.put("Kunal", "AI");
        map.put("Parth", "AI");

        LinkedHashMap<String,ArrayList<String>> map2=new LinkedHashMap<>();

        for (var s : map.entrySet()) {
            String name=s.getKey();
            String dept=s.getValue();

            if (!map2.containsKey(dept)) {
                map2.put(dept, new ArrayList<>());
            }

            map2.get(dept).add(name);
        }

        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
    }
}
