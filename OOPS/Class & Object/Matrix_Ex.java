package OOPS.Class_Object;

import java.util.Scanner;

class Matrix {
    private int[][] arr;

    Matrix(){
        this(new int[1][1]);
    }

    Matrix(int[][] arr){
        setMatrix(arr);
    }

    public void setMatrix(int[][] arr){
        if (arr == null || arr.length == 0){
             this.arr = new int[1][1];
             return;
            }
        this.arr = new int[arr.length][arr[0].length];

        for(int i=0; i<arr.length; i++){
           for(int j = 0; j < arr[i].length; j++){
                int val=arr[i][j];
                if (val<0) val=0;

                this.arr[i][j]=val;
            }
        }
    }

    public int sum(){
    int sum=0;
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){  
            sum+=arr[i][j];
        }
    }
    return sum;
}

    public int rowSum(int row){
    int sum = 0;
    for(int j = 0; j < arr[row].length; j++){
        sum += arr[row][j];
    }
    return sum;
}

   public int colSum(int col){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i][col];
    }
    return sum;
}

    public void displayArray(){
    System.out.println("Matrix : ");
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){   
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}

   public void display(){
    displayArray();
    System.out.println("Total Sum: " + sum());
}
}
public class Matrix_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int[][] arr=new int[size1][size2];

        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        Matrix m1=new Matrix();
        m1.display();

       Matrix m2 = new Matrix(arr);
       m2.displayArray();

       System.out.println("Total Sum: " + m2.sum());

       for(int i = 0; i < arr.length; i++){
        System.out.println("Row " + i + " Sum: " + m2.rowSum(i));
       }

    for(int j = 0; j < arr[0].length; j++){
       System.out.println("Column " + j + " Sum: " + m2.colSum(j));
       }
        sc.close();
    }
}
