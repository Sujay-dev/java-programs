package OOPS.Class_Object;

import java.util.Scanner;

class Analyzer {
    private int[] arr;

    Analyzer(){
        this(new int[3]);
    }

    Analyzer(int[] arr){
        setArray(arr);
    }
    public void setArray(int[] arr){
        if (arr.length==0) {
            this.arr=new int[1];
            return;
        }

        this.arr=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int val=arr[i];

            if (val<0) val=0;

            this.arr[i]=val;
        }
    }

    public int counteven(){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0) {
                count++;
            }
        }
        return count;
    }

    public int countodd(){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2!=0) {
                count++;
            }
        }
        return count;
    }

    public int sum(){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public void displaynumbers(){
        System.out.println("Numbers : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void display(){
        System.out.println("Even numbers : "+ counteven()+ " Odd numbers : "+ countodd() + " Sum of numbers : "+sum());
    }
}
public class Number_Analyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        Analyzer a1=new Analyzer();
        a1.display();

        Analyzer a2=new Analyzer(arr);
        a2.displaynumbers();
        System.out.println("Even numbers : "+a2.counteven());
        System.out.println("Odd numbers : "+a2.countodd());
        System.out.println("Sum of numbers : "+a2.sum());
        a2.display();
        sc.close();
    }
}
