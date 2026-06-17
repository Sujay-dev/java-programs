package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,10);
        map.put(4,20);
        map.put(5,30);
        map.put(6,40);

       HashMap<Integer,Integer> freq=new HashMap<>();

       for (Integer value : map.values()) {
         if (!freq.containsKey(value)) {
            freq.put(value, 1);
         }else{
            freq.put(value, freq.get(value)+1);
         }
       }
       for (var e : freq.entrySet()) {
        System.out.println(e.getKey() + " -> " + e.getValue());
       }
    }
}
