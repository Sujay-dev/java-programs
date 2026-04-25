import java.util.Arrays;
import java.util.Scanner;

public class EXP {
    public static int[] reverse(int arr[]){
        int res[]=arr.clone();
        int start=0;
        int end=res.length-1;
        while (start<end) {
            int temp=res[start];
            res[start]=res[end];
            res[end]=temp;

            start++;
            end--;
        }
        return res;
    }

    public static String reverse(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }

    public static boolean palindrome(int n){
        int org=n;
        int rev=0;
        while (n>0) {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if (rev==org) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean palindrome(String str){
       for(int i=0; i<str.length()/2; i++){
        if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
            return false;
        }
       }
       return true;
    }

    public static int sumof(int n){
        int sum=0;
       while (n>0) {
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }

    public static int maxof(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    public static int minof(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter String : ");
        String str=sc.next();
        System.out.println("Enter number : ");
        int n=sc.nextInt();

        System.out.println("Original Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         System.out.println("Original String : ");
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("Original Number : ");
        System.out.print(n);
        System.out.println();
        System.out.println("After Reversing Array : "+ Arrays.toString(reverse(arr)));
        System.out.print("After Reversing String : "+reverse(str));
        System.out.println();
        if (palindrome(str)) {
        System.out.println("String is Palindrome");
       }else{
        System.out.println("String is Not Palindrome");
       }
       if (palindrome(n)) {
        System.out.println("Number is Palindrome");
       }else{
        System.out.println("Number is Not Palindrome");
       }
       System.out.println("Sum of digits is : "+ sumof(n));
       System.out.println("Maximum element in array is : "+ maxof(arr));
       System.out.println("Smallest element in array is : "+minof(arr));
       sc.close();
    }
}