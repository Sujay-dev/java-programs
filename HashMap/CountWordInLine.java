package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordInLine {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence="Apple Banana Apple Mango Banana Apple";
        HashMap<String,Integer> map=new HashMap<>();

        for (String s : sentence.split(" ")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (var s : map.entrySet()) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            
        }
    }
}
