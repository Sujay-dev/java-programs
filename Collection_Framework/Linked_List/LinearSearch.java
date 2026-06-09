package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list);

        int search=sc.nextInt();

        boolean found=false;
        for(int i=0; i<list.size(); i++){
            if (search==list.get(i)) {
                System.out.println("Found at index: " + i);
                found=true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
