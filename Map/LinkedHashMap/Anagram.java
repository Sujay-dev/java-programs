package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class Anagram {
    public static void main(String[] args) {
        String first="listen";
        String second="Second";

        LinkedHashMap<Character ,Integer> map=new LinkedHashMap<>();

        for (char s : first.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        LinkedHashMap<Character,Integer> map2=new LinkedHashMap<>();
        
        for (char s : second.toCharArray()) {
            map2.put(s, map2.getOrDefault(s, 0)+1);
        }

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
        System.out.println();
        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

         System.out.println();
        if (first.length()!=second.length()) {
            System.out.println("Not Anagram");
            return;
        }
         boolean anagram=true;
        for (char s : map.keySet()) {
           if (!map2.containsKey(s) || !map.get(s).equals(map2.get(s))) {
            anagram=false;
            break;
           }
        }
        if (anagram) {
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
