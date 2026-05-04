package OOPS.Class_Object;

import java.util.Scanner;

class Max {
    public int max(int a, int b){
        return(a>b) ? a:b;
    }

    public int max(int a, int b, int c){
        int max=a;

        if (b>max && b>max) {
            return b;
        }
        else if (c>max && c>max) {
            return c;
        }

        return max;
    }
}

public class Max_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Max m1=new Max();

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(m1.max(a, b));
        System.out.println(m1.max(a, b, c));
        sc.close();
    }
}
