package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class MaxFreqChar {
    public static void main(String[] args) {
        String word="aabbccccddffg";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for (char s : word.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        int max=Integer.MIN_VALUE;
        char c='#';

        for (var s : map.entrySet()) {
            if (s.getValue()>max) {
                max=s.getValue();
                c=s.getKey();
            }
        }

        System.out.println("Most Frequent Character: ");
        System.out.println(c + " -> " + max);
    }
}
