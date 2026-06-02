package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list1=new ArrayList<>();

        for(int i=0; i<5; i++){
            list1.add(sc.nextInt());
        }

        ArrayList<Integer> list2=new ArrayList<>(list1);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        sc.close();

    }
}
