package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         ArrayList<Integer> numbers=new ArrayList<>();
        
        for(int i=0; i<5; i++){
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);

        int highest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0; i<numbers.size(); i++){
            if (numbers.get(i)>highest) {
                second=highest;
                highest=numbers.get(i);
            }else if (numbers.get(i)>second && numbers.get(i)!=highest) {
                second=numbers.get(i);
            }
        }

        System.out.println("Highest: " + highest);
        if(second == Integer.MIN_VALUE){
         System.out.println("No Second Highest");
        }else{
        System.out.println("Second Highest: " + second);
        }
        
        sc.close();
    }
}
