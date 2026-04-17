package Final_Revision;

import java.util.Scanner;

public class Array {
    public static int maxis(int arr[],int size){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    public static int minis(int arr[], int size){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }

     public static void duplicate(int arr[], int size){
        System.out.println("After removing duplicates : ");
        for(int i=0; i<arr.length; i++){
             boolean duplicate=false;
            for(int j=0; j<i; j++){
                if (arr[i]==arr[j]) {
                    duplicate=true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static int second(int arr[], int size){
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                sec=max;
                max=arr[i];
            }else if (arr[i]>sec && arr[i]!=max) {
                sec=arr[i];
            }
        }
        return sec;
    }

    public static void reverse(int arr[], int size){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println("After reversing array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]+ " ");
        }
    }

    public static void left(int arr[], int size){
        System.out.println("Rotating left by 1 : ");
        int temp=arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        System.out.println("Largest element in array is : "+ maxis(arr, size));
        System.out.println("Smallest element in array is : "+ minis(arr, size));
        System.out.println("Second largest element in array is : "+ second(arr, size));
         left(arr, size);
        duplicate(arr, size);
        reverse(arr, size);
        sc.close();
    }
}
