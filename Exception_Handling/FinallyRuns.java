package Exeption_Handling;

import java.util.Scanner;

public class FinallyRuns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Start..");

       try {
        System.out.println("1 to 10");
        sc.close();
        return;
       } 
       finally{
        System.out.println("End...");
       }
    }
}
