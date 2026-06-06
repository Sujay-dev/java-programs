package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Boy{
    private String name;
    private double gpa;

    Boy(String name, double gpa){
        this.name=name;
        this.gpa=gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }
}
public class StudentComparator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Boy> boys=new ArrayList<>();

        for(int i=0; i<3; i++){
            String name=sc.nextLine();
            double gpa=sc.nextDouble();
            sc.nextLine();

            boys.add(new Boy(name, gpa));
        }

        Collections.sort(boys,(a,b) -> Double.compare(b.getGpa(), a.getGpa()));

        for (Boy b : boys) {
            System.out.println("Name: " + b.getName() + " gpa: " + b.getGpa());
        }
        sc.close();
    }
}
