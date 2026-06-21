package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class MostFrequent {
    public static void main(String[] args) {
        String sentence="Java Python Java C Python Java";

        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

        for (String s : sentence.split(" ")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        int max=Integer.MIN_VALUE;
        String key="-1";

        for (var s : map.entrySet()) {
            if (s.getValue()>max) {
                max=s.getValue();
                key=s.getKey();
            }
        }

        System.out.println("Most Frequent Word: ");
        System.out.println(key + " -> " + max);
    }
}
