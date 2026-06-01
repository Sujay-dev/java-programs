package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         try {
            int age = sc.nextInt();
            isValid(age);  
            System.out.println("Valid Age");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    public static int isValid(int age) throws InvalidAgeException{
         if (age<18) {
            throw new InvalidAgeException("Invalid Age");
        }
        return age;
    }
}
