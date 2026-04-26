package Final_Revision;

import java.util.Scanner;

public class Strings2 {
    public static char nonrepeating(String str){
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
        s1=s1.replace(" ", "");
        s2=s2.replace(" ", "");
        if (s1.length() != s2.length()) return false;
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

    public static void duplicate(String str){
        for(int i=0; i<str.length(); i++){
            boolean duplicate=false;
            for(int j=0; j<i; j++){
                if (str.charAt(i)==str.charAt(j)) {
                    duplicate=true;
                }
            }
        if (!duplicate) {
            System.out.print(str.charAt(i));
        }
        }
    }

    public static void compression(String str){
        for(int i=0; i<str.length(); i++){
            boolean found=false;
            for(int j=0; j<i; j++){
                if (str.charAt(i)==str.charAt(j)) {
                    found=true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count=1;
            for(int k=i+1; k<str.length(); k++){
                if (str.charAt(i)==str.charAt(k)) {
                    count++;
                }
            }
           if(count > 1){
                 System.out.print(str.charAt(i) + "" + count); 
              } else {
                 System.out.print(str.charAt(i));              
              }
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.next();
        System.out.println("Enter first string for checking anagram : ");
        String s1=sc.next();
        System.out.println("Enter second string for checking anagram : ");
        String s2=sc.next();
        System.out.print("Original String : " + str);
        System.out.println();
        System.out.println("The first non repeating character in string is : "+ nonrepeating(str));
        System.out.println("After compressing string : ");
         compression(str);
         System.out.println();
         System.out.println("After removing duplicates from String : ");
        duplicate(str);
        System.out.println();
        System.out.print("First string is : "+ s1);
        System.out.println();
        System.out.print("Second string is : "+ s2);
        System.out.println();
        if (anagram(s1,s2)) {
            System.out.println("Both strings are Anagram");
        }else{
            System.out.println(" Strings are not anagram");
        }
        sc.close();
    }
}
