package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Java");
        map.put(4, "C");
        map.put(5, "JavaScript");

         for (Integer i : map.keySet()) {
         System.out.println(i + " -> " + map.get(i));   
        }
        System.out.println();

         int count=0;
         for (String i : map.values()) {
            if (i.equals("Java")) {
                count++;
            }
         }
         System.out.println("Java Appeared: " + count + " Times");
    }
}
