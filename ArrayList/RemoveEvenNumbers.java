package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

          ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i=0; i<5; i++){
            numbers.add(sc.nextInt());
        }

        System.out.println("Before: " + numbers);

        ArrayList<Integer> toRemove = new ArrayList<>();
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){  
                toRemove.add(numbers.get(i));
            }
        }

        for(int num : toRemove){
            numbers.remove((Integer)num); 
        }

        System.out.println("After:  " + numbers);
        sc.close();
    }
}
