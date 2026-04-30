package OOPS;

import java.util.Scanner;

class Arrraystats {
    int arr[];

    int maxis(){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    int minis(){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }

    double avgrageis(){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
         double avg=(double)sum/arr.length;

         return avg;
    }

    int counteven(){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0) {
                count++;
            }
        }
        return count;
    }
}

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arrraystats as1=new Arrraystats();
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        as1.arr=arr;

        System.out.println("Largest element in array is : "+ as1.maxis());
        System.out.println("Smallest element in array is  : "+ as1.minis());
        System.out.println("Average of array is  : "+ as1.avgrageis());
        System.out.println("Even Numbers in array : "+ as1.counteven());
        sc.close();
    }
}
