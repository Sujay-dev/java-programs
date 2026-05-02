package OOPS;

import java.util.Scanner;

class Calculators {
    int a;
    int b;
    
    int add(){
        return a+b;
    }

    int sub(){
        if (a<b) {
            return -1;
        }
        return a-b;
    }

    int mult(){
        return a*b;
    }

    int div(){
        if (a<b) {
            return -1;
        }
        return a/b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Calculators c1=new Calculators();
        System.out.println("Enter first number : ");
        c1.a=sc.nextInt();
        System.out.println("Enter second number : ");
        c1.b=sc.nextInt();
        System.out.println("Addition is : "+c1.add());
        System.out.println("Substraction is : "+ c1.sub());
        System.out.println("Multiplication is : "+ c1.mult());
        System.out.println("Division is "+c1.div());
        sc.close();
    }
}
