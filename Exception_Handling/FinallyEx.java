package Exeption_Handling;

import java.util.Scanner;

public class FinallyEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println(getValue());
        }catch(RuntimeException e){
            System.out.println("Invalid");
        }
        sc.close();
    }
    public static int getValue(){
        try{
            return 10;
        }
        finally{
            System.out.println("Done");
        }
    }
}
