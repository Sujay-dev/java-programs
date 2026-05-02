package OOPS;

import java.util.Scanner;

class Circle {
    int r;

    double area(){
        return 3.14*r*r;
    }
}
public class Circle_Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Circle c1=new Circle();
        System.out.println("Enter Radius : ");
        c1.r=sc.nextInt();
        System.out.println("Area of Circle is : "+ c1.area());
        sc.close();
    }
    
}
