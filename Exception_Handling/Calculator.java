package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu{
    public int Add(int a, int b){
       return a+b;
    }

    public double divide(int a, int b){
        if (b==0) {
            throw new ArithmeticException("Cannot Divide");
        }
        return a/b;
    }
}
public class Calculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        Menu m=new Menu();

        while (true) {
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Division");
            System.out.println("Enter 3 for EXIT");
        try {
             int choice = sc.nextInt();

            if(choice == 1){
              int a = sc.nextInt();
              int b = sc.nextInt();
              System.out.println(m.Add(a,b));
              }
            else if(choice == 2){
              int a = sc.nextInt();
              int b = sc.nextInt();
              System.out.println(m.divide(a,b));
             }
            else if(choice == 3){
              System.out.println("Exit");
              break;
             }
            else{
              System.out.println("Invalid");
             }

             } catch (InputMismatchException e){
              System.out.println("Invalid Input");
              sc.nextLine(); 
             } catch (ArithmeticException e){
              System.out.println(e.getMessage());
             }
        }
        sc.close();
    }
}


