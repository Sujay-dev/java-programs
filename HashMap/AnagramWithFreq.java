package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramWithFreq {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first="listen";
        String second="silent";

        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for (char s : first.toCharArray()) {
            map.put(s,map.getOrDefault(s, 0)+1);
        }

         for (char k : second.toCharArray()) {
            map2.put(k,map2.getOrDefault(k, 0)+1);
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
        sc.close();
    }
}
