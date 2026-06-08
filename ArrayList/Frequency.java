package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        for(int i=0; i<numbers.size(); i++){
            boolean found=false;
            for(int j=0; j<i; j++){
                if (numbers.get(i).equals(numbers.get(j))) {
                    found=true;
                    break;
                }
            }

            if (found) continue;
            
            int count=1;

            for(int k=i+1; k<numbers.size(); k++){
                if (numbers.get(i).equals(numbers.get(k))) {
                   count++;   
                }
            }

            System.out.println(numbers.get(i) + " -> " + count);
        }
        sc.close();
    }
}
