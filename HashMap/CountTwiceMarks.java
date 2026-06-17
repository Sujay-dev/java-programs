package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountTwiceMarks {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Sujay", 82);
        map.put("Vedant", 62);
        map.put("Rohan", 82);
        map.put("Suyash", 67);
        map.put("Athrava", 82);

        HashMap<Integer,Integer> freq=new HashMap<>();
        
        for (Integer s : map.values()) {
            freq.put(s, freq.getOrDefault(s, 0)+1);
        }

        for (var s : freq.entrySet()) {
            if (s.getValue()>1) {
                System.out.println(s.getKey() + " appeared " + s.getValue() + " times");
            }
        }
    }
}
