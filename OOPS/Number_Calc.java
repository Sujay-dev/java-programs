package OOPS;

import java.util.Scanner;

class NumberUtils {
    int number;    

    void isEven(){
        if (number%2==0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }

    boolean isprime(){
            if (number<=1) {
               return false;
            }
            for(int i=2; i*i<=number; i++){
                if (number%i==0) {
                   return false;
                }
            }
             return true;
        }

        int sumofdigits(){
            int sum=0;
           int temp = number;
           while (temp > 0){
              int d = temp % 10;
              sum += d;
              temp /= 10;
           }
            return sum;
        }
}

public class Number_Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        NumberUtils n1=new NumberUtils();
        System.out.println("Enter number : ");
        n1.number=sc.nextInt();
        n1.isEven();
        if (n1.isprime()) {
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime ");
        }
       System.out.println("Sum of digits of number is : "+n1.sumofdigits());
        sc.close();
    }
}
