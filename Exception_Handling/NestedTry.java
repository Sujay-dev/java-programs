package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
           int a = sc.nextInt();
           int b = sc.nextInt();

        try {
        System.out.println(a / b);
        } catch (ArithmeticException e) {
        System.out.println("Cannot Divide by Zero");
        }

        } catch (InputMismatchException e) {
        System.out.println("Invalid Input");
        }

        sc.close();
    }
}
