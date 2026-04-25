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
        return '*';
    }

   public static boolean anagram(String s1, String s2){
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();

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

   public static int[] leftrotate(int arr[]){
    int res[]=arr.clone();
    int temp=res[0];
    for(int i=0; i<res.length-1; i++){
        res[i]=res[i+1];
    }
    res[res.length-1]=temp;

    return res;
   }

   public static int[] rightrotate(int arr[]){
    int res[]=arr.clone();
    int temp=res[res.length-1];
    for(int i=res.length-1; i>0; i--){
        res[i]=res[i-1];
    }
    res[0]=temp;

    return res;
   }

   public static void duplicate(int arr[]){
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

   public static int second(int arr[]){
    if (arr.length<2) {
        return -1;
    }
    int max=Integer.MIN_VALUE;
    int sec=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if (arr[i]>max) {
            sec=max;
            max=arr[i];
        }
        else if (arr[i]>sec && arr[i]!=max) {
            sec=arr[i];
        }
    }
    return sec;
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
            if (arr[i]==arr[k]) {
                count++;
            }
        }
        System.out.println(arr[i]+" : "+ count);
    }
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
         System.out.println("Enter size of Array : ");
        int size1=sc.nextInt();
        int arr2[]=new int[size1];
        System.out.println("Enter Array elements : ");
        for(int i=0; i<size1; i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter String : ");
        String str=sc.next();
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        System.out.println("Enter first string for checking anagram : ");
        String s1=sc.next();
        System.out.println("Enter second string for checking anagram : ");
        String s2=sc.next();
         System.out.println("Original Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Reversing Array : "+ Arrays.toString(reverse(arr)));
        System.out.println("Maximum element in array is : "+ maxof(arr));
        System.out.println("Second Largest element is : "+ second(arr));
       System.out.println("Smallest element in array is : "+minof(arr));
        System.out.print("After rotating array left by 1 : "+ Arrays.toString(leftrotate(arr)));
       System.out.println();
       System.out.print("After rotating array right by 1 : "+ Arrays.toString(rightrotate(arr)));
       System.out.println();
       frequency(arr);
       System.out.println("Original Array : ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
       System.out.println("After moving zeros to end : "+ Arrays.toString(zeros(arr2)));
       System.out.print("After removing duplicates : ");
       duplicate(arr2);
         System.out.println("Original String : ");
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.print("After Reversing String : "+reverse(str));
        System.out.println();
        if (palindrome(str)) {
        System.out.println("String is Palindrome");
       }else{
        System.out.println("String is Not Palindrome");
       }
        System.out.println("First non repeting element in string is : "+ nonrepeting(str));
         System.out.print("First String is : "+ s1);
         System.out.println();
       System.out.print("Second string is : "+s2);
       System.out.println();
       if (anagram(s1, s2)) {
        System.out.println("Strings are Anagram");
       }else{
        System.out.println("Strings are Not anagram");
       }
       System.out.println("Original Number : ");
        System.out.print(n);
        System.out.println();
       if (palindrome(n)) {
        System.out.println("Number is Palindrome");
       }else{
        System.out.println("Number is Not Palindrome");
       }
       System.out.println("Sum of digits is : "+ sumof(n));
       sc.close();
    }
}
