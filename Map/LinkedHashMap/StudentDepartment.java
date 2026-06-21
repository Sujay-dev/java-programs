package Maps.LinkedHashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StudentDepartment {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("Sujay", "Computer");
        map.put("Vedant", "Electronics");
        map.put("Suyash", "Computer");
        map.put("Rohan", "Computer");
        map.put("Kunal", "AI");
        map.put("Athrava", "Electronics");
        LinkedHashMap<String,ArrayList<String>> freq=new LinkedHashMap<>();

        for (var s : map.entrySet()) {
            String name=s.getKey();
            String dept=s.getValue();

            if (!freq.containsKey(dept)) {
                freq.put(dept, new ArrayList<>());
            }

            freq.get(dept).add(name);
        }

        for (var s: freq.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
    }
}
