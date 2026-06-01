package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }

            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
            }

            System.out.println("Sum of Array is : " + sum);
        } catch (InputMismatchException e) {
           System.out.println("Invalid Input");
        }
        sc.close();
    }
}
