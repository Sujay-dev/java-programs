package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LangFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        map.put("Sujay","Java");
        map.put("Vedant","Python");
        map.put("Rohan","C");
        map.put("Suyash","Java");
        map.put("Athrava","Python");
        map.put("Gaurav","C++");

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
