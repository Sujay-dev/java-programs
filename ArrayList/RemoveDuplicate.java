package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();

        for(int i=0; i<10; i++){
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);
        
        for(int i=0; i<numbers.size(); i++){
            for(int j=i+1; j<numbers.size(); j++){
                if (numbers.get(i).equals(numbers.get(j))) {
                    numbers.remove(j);
                    j--;
                }
            }
        }

        System.out.println(numbers);

        sc.close();
    }
}
