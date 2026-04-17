package Final_Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static int[] right(int arr[]){
        if (arr.length==0) return arr;
        System.out.println("After Rotating by 1 : ");

        int[]res=arr.clone();
        int temp=res[res.length-1];
        for(int i=res.length-1; i>0; i--){
            res[i]=res[i-1];
        }
        res[0]=temp;

        return res;
    }

    public static void zeros(int arr[]){
        System.out.println("After moving zeros to end : ");
        int index=0;

        for(int i=0; i<arr.length; i++){
            if (arr[i]!=0) {
                arr[index]=arr[i];
                index++;
            }
        }
        while (index<arr.length) {
            arr[index]=0;
            index++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
        System.out.println(Arrays.toString(right(arr)));
        zeros(arr);
        sc.close();
    }
}
