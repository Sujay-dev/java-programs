package OOPS;

import java.util.Scanner;

class Rectangle {
         int length;
         int width;

         double area(){
            return length*width;
         }
    
}
public class Rectangle_Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Rectangle r1=new Rectangle();
        System.out.println("Enter length : ");
        r1.length=sc.nextInt();
        System.out.println("Enter width : ");
        r1.width=sc.nextInt();

        System.out.println("Area of rectangle is : "+ r1.area());
        sc.close();
    }
    
}
