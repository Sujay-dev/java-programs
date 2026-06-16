package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);

         for (Integer i : map.keySet()) {
         System.out.println(i + " -> " + map.get(i));   
        }
        System.out.println();

         int min=Integer.MAX_VALUE;
         for (Integer i : map.values()) {
            if (i<min) {
                min=i;
            }
         }
         System.out.println("Smallest Value: " + min );
    }
}
