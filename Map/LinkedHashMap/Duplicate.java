package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class Duplicate {
    public static void main(String[] args) {
        String word="Programming";

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for (char s : word.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (var s : map.entrySet()) {
            if (s.getValue()>1) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            }
        }
    }
}
