package Exeption_Handling;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n[]={100,200,300,400};
        int d[]={1,2,0,4};

        for(int i=0; i<n.length; i++){
            System.out.println( divide(n[i], d[i]));
        }
        System.out.println("Ek no Bhava");
        sc.close();
    }
    public static int  divide(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Bhaiya Zero n nay r hot divide" );
            return -1;
        }
        
    }
}
