package Maps.LinkedHashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GroupByMarks {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("Sujay", 82);
        map.put("Vedant", 63);
        map.put("Suyash", 68);
        map.put("Rohan", 68);
        map.put("Athrava", 68);
        map.put("Kunal", 70);
        map.put("Parth", 70);
        map.put("Satyam", 82);

        LinkedHashMap<Integer,ArrayList<String>> map2=new LinkedHashMap<>();

        for (var s : map.entrySet()) {
            String name=s.getKey();
            int marks=s.getValue();

            if (!map2.containsKey(marks)) {
                map2.put(marks, new ArrayList<>());
            }

            map2.get(marks).add(name);
        }

        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
    }
}
