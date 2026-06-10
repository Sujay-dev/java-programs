package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class RotateRight {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int last = list.removeLast();
        list.addFirst(last);

        System.out.println(list);
        sc.close();
    }
}
