package OOPS;

import java.util.Scanner;

class NumberUtils {
   private int number;  
    
    NumberUtils(int number){
        setNumber(number);
    }

    public void setNumber(int number){
            this.number=number;
    }

   public boolean isEven(){
        if (number%2!=0) {
            return false;
        }
        return true;
    }

   public boolean isprime(){
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

      public  int sumofdigits(){
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

         System.out.println("Enter number : ");
         int number=sc.nextInt();

        NumberUtils n1=new NumberUtils(number);
       if (n1.isEven()){
        System.out.println("Number is Even ");
       }else{
        System.out.println("Number is odd ");
       }
        if (n1.isprime()) {
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime ");
        }
       System.out.println("Sum of digits of number is : "+n1.sumofdigits());
        sc.close();
    }
}
