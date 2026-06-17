package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CharMaxfreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence="aabbcccfffiiiksi";

        HashMap<Character,Integer> map=new HashMap<>();
        for (char s : sentence.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        Character c='#';
        int max=Integer.MIN_VALUE;
        for (var s : map.entrySet()) {
            if (s.getValue()>max) {
                 c=s.getKey();
                max=s.getValue();
            }
        }
        System.out.println(c + " -> " + max);
    }
}
