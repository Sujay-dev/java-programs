package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter 3 integers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("You entered: " + a + " " + b + " " + c);

        } catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter only integers.");
        }

        sc.close();
    }
}