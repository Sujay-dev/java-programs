package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Cherry");

        int key=sc.nextInt();

        if (map.containsKey(key)) {
            System.out.println("Found: " + map.get(key));
        }else{
            System.out.println("Not Found");
        }
    }
}
