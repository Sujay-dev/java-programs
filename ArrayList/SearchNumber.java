package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();

        for(int i=0; i<5; i++){
            numbers.add(sc.nextInt());
        }

        int search=sc.nextInt();

        if (numbers.contains(search)) {
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
        
        sc.close();
    }
}
