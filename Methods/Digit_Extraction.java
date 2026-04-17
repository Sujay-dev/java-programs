package Final_Revision;

import java.util.Scanner;

public class Digit_Extraction {
   public static int sumof(int n){
    int sum=0;
    while (n>0) {
        int d=n%10;
        sum+=d;
        n/=10;
    }
    return sum;
   }

   public static int product(int n){
    int product=1;
    while (n>0) {
        int d=n%10;
        product*=d;
        n/=10;
    }
    return product;
   }

   public static int count(int n){
    int count=0;
    while (n>0) {
        count++;
        n/=10;
    }
    return count;
   }

   public static int factorial(int n){
    int fact=1;
    for(int i=1; i<=n; i++){
        fact*=i;
    }
    return fact;
   }

   public static boolean isstrong(int n){
    int sum=0;
    int org=n;
    while (n>0) {
        int d= n%10;
        sum+=factorial(d);
        n/=10;
    }
    return sum==org;
   }

   public static boolean perfect(int n){
    int sum=0;
    for(int i=1; i<=n/2; i++){
        if (n%i==0) {
        sum+=i;
        }
    }
    return sum==n;
   }

   public static int gcd(int a, int b){
    while (b!=0) {
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

       System.out.println("Sum of digits is : "+ sumof(n));
       System.out.println("Product of digits is : "+ product(n));
       System.out.println("Count of digits is : "+ count(n));
       if (isstrong(n)) {
        System.out.println("Given number is Strong");
       }else{
        System.out.println("Number is Not Strong");
       }

       if (perfect(n)) {
        System.out.println("Given number is Perfect");
       }else{
        System.out.println("Number is Not perfect");
       }

       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(gcd(a, b));
        sc.close();
    }
}
