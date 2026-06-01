package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println("Addition: " + (a+b));
            System.out.println("Division: " + (a/b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
        sc.close();
    }
}
