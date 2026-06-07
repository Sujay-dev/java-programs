package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(80);
        list1.add(60);
        list1.add(40);

        System.out.println(list1);

        System.out.println();

        ArrayList<Integer> list2=new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(90);
        
        System.out.println(list2);

        System.out.println();

        System.out.println("Common Elements in List");
        for(int i=0; i<list1.size(); i++){
            for(int j=0 ;j<list2.size(); j++){
               if (list1.get(i).equals(list2.get(j))) {
                System.out.println(list1.get(i));
               }
            } 
        }
        sc.close();
    }
}
