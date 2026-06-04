package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         ArrayList<Integer> numbers=new ArrayList<>();

        for(int i=0; i<5; i++){
            numbers.add(sc.nextInt());
        }

        for(int i=0; i<numbers.size(); i++){
            System.out.print(numbers.get(i)+ " ");
        }

        System.out.println();

        int index=sc.nextInt();
        int value=sc.nextInt();

        numbers.set(index, value);

        for(int i=0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        sc.close();
    }
}
