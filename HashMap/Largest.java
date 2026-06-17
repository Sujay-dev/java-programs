package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 100);
        map.put(2, 50);
        map.put(3, 300);
        map.put(4, 200);
        map.put(5, 60);
        
        int max=Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            if (value>max) {
                max=value;
            }
        }

        System.out.println("Largest Value: " + max);
    }
}
