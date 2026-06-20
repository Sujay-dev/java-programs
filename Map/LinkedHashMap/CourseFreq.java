package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class CourseFreq {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("Sujay", "Computer");
        map.put("Vedant", "AI");
        map.put("Suyash", "AI");
        map.put("Rohan", "Computer");
        map.put("Kunal", "AI");

        LinkedHashMap<String ,Integer> freq=new LinkedHashMap<>();

        for (String s : map.values()) {
            freq.put(s, freq.getOrDefault(s, 0)+1);
        }

        for (var s : freq.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
