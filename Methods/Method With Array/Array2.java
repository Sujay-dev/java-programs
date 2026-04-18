package Final_Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static int[] right(int arr[]){
        if (arr.length==0) return arr;
        System.out.println("After Rotating Right by 1 : ");

        int[]res=arr.clone();
        int temp=res[res.length-1];
        for(int i=res.length-1; i>0; i--){
            res[i]=res[i-1];
        }
        res[0]=temp;

        return res;
    }

    public static void frequency(int arr[]){
        System.out.println("Frequency of element in array is : ");
        for(int i=0; i<arr.length; i++){
            boolean found=false;
            for(int j=0; j<i; j++){
                if (arr[i]==arr[j]) {
                    found=true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            int count=1;

            for(int k=i+1; k<arr.length; k++){
                if (arr[k]==arr[i]) {
                    count++;
                }
            }

            System.out.println(arr[i]+" : "+ count);
        }
    }

    public static int[] zeros(int arr[]){
        System.out.println("After moving zeros to end : ");
        int index=0;
        int res[]=arr.clone();

        for(int i=0; i<res.length; i++){
            if (res[i]!=0) {
                res[index]=res[i];
                index++;
            }
        }
        while (index<res.length) {
            res[index]=0;
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
        System.out.println(Arrays.toString(right(arr)));
        frequency(arr);
        System.out.println(Arrays.toString(zeros(arr)));
        sc.close();
    }
}

