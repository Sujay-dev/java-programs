package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class DeleteStudentID {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101, "Sujay");
        map.put(102, "Vedant");
        map.put(103, "Rohan");
        map.put(104, "SUyash");
        map.put(105, "Athrava");

         for (Integer i : map.keySet()) {
         System.out.println(i + " -> " + map.get(i));   
        }
        System.out.println();

        System.out.println("Enter ID for Deleting: ");
         int id=sc.nextInt();
         if (map.containsKey(id)) {
            System.out.println("Removed ID: ");
            System.out.println("ID: " + id + " Name: " + map.get(id));

            map.remove(id);
         }else{
            System.out.println("Invalid ID");
         }

         System.out.println();
         
          for (Integer i : map.keySet()) {
         System.out.println(i + " -> " + map.get(i));   
        }
    }
}
