package OOPS.Class_Object;

import java.util.Scanner;

class Print {
    public void print(int a){
        System.out.println(a);
    }

    public void print(String str){
        System.out.println(str);
    }

    public void print(int a, String str){
        System.out.println(a+" "+ str);
    }
}

public class Print_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Print p1=new Print();

         String str=sc.nextLine();
        int a=sc.nextInt();

        p1.print(a);
        p1.print(str);
        p1.print(a, str);
        sc.close();
    }
}
