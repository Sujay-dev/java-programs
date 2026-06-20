package Maps.LinkedHashmap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountWordFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C");
        map.put(4,"Java");
        map.put(5,"Python");
        map.put(6,"C++");

        LinkedHashMap<String,Integer> freq=new LinkedHashMap<>();
        for (String s : map.values()) {
            freq.put(s, freq.getOrDefault(s, 0)+1);
        }

        for (var s : freq.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
        sc.close();
    }
}
