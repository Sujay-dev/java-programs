package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidMarksException extends Exception{
    InvalidMarksException(String msg){
        super(msg);
    }
}

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int marks=sc.nextInt();
            marks(marks);
            System.out.println("Valid Marks");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        sc.close();
    }
    
    public static int marks(int marks) throws InvalidMarksException{
        if (marks<0 || marks>100) {
            throw new InvalidMarksException("Invalid Marks");
        }
        return marks;
    }
}
