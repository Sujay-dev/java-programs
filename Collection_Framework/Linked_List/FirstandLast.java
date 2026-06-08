package CollectionFramework;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstandLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        sc.close();
    }
}
