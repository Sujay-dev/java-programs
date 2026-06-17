package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class WordFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C");
        map.put(4,"Java");
        map.put(5,"Python");
        map.put(6,"C++");

        HashMap<String,Integer> frequency=new HashMap<>();

        for (String s : map.values()) {
            if (!frequency.containsKey(s)) {
                frequency.put(s, 1);
            }else{
                frequency.put(s, frequency.get(s)+1);
            }
        }

        for (var s : frequency.entrySet()) {
            System.out.println(s.getKey() + " -> "+ s.getValue());
        }
    }
}
