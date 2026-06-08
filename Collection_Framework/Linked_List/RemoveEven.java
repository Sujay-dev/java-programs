package CollectionFramework;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);
        
        list.removeIf(x -> x%2==0);

        System.out.println(list);
        sc.close();
    }
}
