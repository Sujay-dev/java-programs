package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class DeleteId {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101, "Sujay");
        map.put(102, "Vedant");
        map.put(103, "Rohan");
        map.put(104, "Suyash");
        map.put(105, "Athrava");

         for (Integer i : map.keySet()) {
         System.out.println(i + " -> " + map.get(i));   
        }
        System.out.println();

        int removeId=sc.nextInt();
        if (map.containsKey(removeId)) {
            map.remove(removeId);
        }else{
            System.out.println("Invalid ID");
        }

        System.out.println();
        
        for (Integer i : map.keySet()) {
         System.out.println(i + " -> " + map.get(i));   
        }
    }
}
