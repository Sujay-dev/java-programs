package Final_Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Last_one {
    public static int[] zeros(int arr[]){
        int res[]=arr.clone();
        int index=0;
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

    public static int second(int arr[]){
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        if (arr.length<=1) {
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                sec=max;
                max=arr[i];
            }else if (arr[i]>sec && arr[i]!=max) {
                sec=arr[i];
            }
        }
        if (sec==Integer.MIN_VALUE) {
            return -1;
        }
        return sec;
    }

   public static char nonrepeting(String str){
    for(int i=0; i<str.length(); i++){
        int count=0;
        for(int j=0; j<str.length(); j++){
            if (str.charAt(i)==str.charAt(j)) {
                count++;
            }
        }
        if (count==1) {
            return str.charAt(i);
        }
    }
    return '#';
   }

   public static boolean anagram(String s1,String s2){
    s1 = s1.toLowerCase().replaceAll("\\s", "");
    s2 = s2.toLowerCase().replaceAll("\\s", "");
    if (s1.length()!=s2.length()) {
        return false;
    }
    int freq[]=new int[26];
    for(int i=0; i<s1.length(); i++){
        freq[s1.charAt(i) - 'a']++;
        freq[s2.charAt(i) - 'a']--;
    }

    for(int i=0; i<26; i++){
        if (freq[i]!=0) {
            return false;
        }
    }
    return true;
   }

  public static boolean prime(int n){
    if (n<=1) {
        return false;
    }

    for(int i=2; i*i<=n; i++){
        if (n%i==0) {
            return false;
        }
    }
    return true;
  }

  public static void fibonacci(int n){
    int a=0;
    int b=1;
    for(int i=0; i<=n; i++){
        System.out.print(a+" ");
        int next=a+b;
        a=b;
        b=next;
    }
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter String : ");
        String str=sc.next();
        System.out.println("Enter first String for checking anagram : ");
        String s1=sc.next();
        System.out.println("Enter second string for checcking anagram : ");
        String s2=sc.next();
        System.out.println("Enter number for checking it is prime or not : ");
        int x=sc.nextInt();
        System.out.println("Enter number for printing its fibonacci series : ");
        int n=sc.nextInt();
        System.out.println("Enter first number getting GCD : ");
        int a=sc.nextInt();
        System.out.println("Enter second number for getting GCD : ");
        int b=sc.nextInt();
        System.out.println("Original array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("After moving zeros to end : "+ Arrays.toString(zeros(arr)));
        System.out.println("Second largest element in array is  : "+ second(arr));
        System.out.println("Original String : ");
        System.out.print(str);
        System.out.println();
        System.out.println("The first non repeting element in String is : "+ nonrepeting(str));
        System.out.println("The first String is  : ");
        System.out.print(s1);
        System.out.println();
        System.out.println("The second string is  : ");
        System.out.print(s2);
        System.out.println();
        if (anagram(s1, s2)) {
            System.out.println("Both strings are Anagram");
        }
        else{
            System.out.println("String are Not anagram");
        }

        System.out.println("Given number for checking prime or not is : "+ x);
        if (prime(x)) {
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("Number is Not prime");
        }
        System.out.println("Given number is : "+ n);
        System.out.println("Fibonacci series of given number is : ");
        fibonacci(n);
        System.out.println();
        System.out.println("Two numbers given for getting GCD are  : "+ a+ " "+ b);
        System.out.println("GCD of given two number is : "+ gcd(a, b));
        sc.close();
    }
    
}
