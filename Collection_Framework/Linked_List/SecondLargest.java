package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list);

        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if (list.get(i)>max) {
                second=max;
                max=list.get(i);
            }else if (list.get(i)>second && list.get(i)!=max) {
                second=list.get(i);
            }
        }

        if (second==Integer.MIN_VALUE) {
           System.out.println("No second Largest element");
        }else{
            System.out.println("Second Largest: " + second);
        }
    }
}
