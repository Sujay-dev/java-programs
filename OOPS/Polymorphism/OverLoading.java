package Revision;

import java.util.Scanner;

class Sumof{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        Sumof s=new Sumof();
        System.out.println(s.add(a,b));
        System.out.println(s.add(a, b, c));
        sc.close();
    }
}
