package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharInWord {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence="Apple";
        HashMap<Character,Integer> map=new HashMap<>();

        for (char s : sentence.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (var s : map.entrySet()) {
            if (s.getValue()>1) {
                 System.out.println(s.getKey() + " -> " + s.getValue());
            
            }
        }
    }
}
