package OOPS.Class_Object;

import java.util.Scanner;

class Calc {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }
}

public class Cal_Ex {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);

        Calc c1=new Calc();
        int a=sk.nextInt();
        int b=sk.nextInt();
        int c=sk.nextInt();

        System.out.println(c1.add(a, b));
        System.out.println(c1.add(a, b, c));
        System.out.println(c1.add((double)a, (double)b));
        sk.close();
    }
}
