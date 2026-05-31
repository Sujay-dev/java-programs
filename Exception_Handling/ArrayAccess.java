package Exeption_Handling;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        try {
            int index=sc.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
        sc.close();
    }
}
