package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainReservation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> train=new LinkedList<>();

        train.add(101);
        train.add(102);
        train.add(103);
        train.add(104);

        System.out.println("Train: " + train);

        train.addFirst(100);
        System.out.println("Train: " + train);

        train.addLast(105);
        System.out.println("Train: " + train);

        train.removeFirst();
        System.out.println("Train: " + train);
        
        train.removeLast();
        System.out.println("Train: " + train); 
        sc.close();
    }
}
