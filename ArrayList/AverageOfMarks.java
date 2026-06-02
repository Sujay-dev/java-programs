package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         ArrayList <Integer> Marks=new ArrayList<>();

        Marks.add(sc.nextInt());
        Marks.add(sc.nextInt());
        Marks.add(sc.nextInt());
        Marks.add(sc.nextInt());
        
        int sum=0;
        for(int i=0; i<Marks.size(); i++){
            sum+=Marks.get(i);
        }

        double avg=(double)sum/Marks.size();

        System.out.println("Average: " + avg);
        sc.close();
    }
}
