package Final_Revision;
import java.util.Scanner;

public class String_Builder {
    public static String reverse(String str){
       StringBuilder sb=new StringBuilder();
       for(int i=str.length()-1; i>=0; i--){
        sb.append(str.charAt(i));
       }
       return sb.toString();
    }

    public static String vowels(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            char ch=sb.charAt(i);
            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static String duplicate(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            for(int j=0; j<i; j++){
                if (sb.charAt(i)==sb.charAt(j)) {
                sb.deleteCharAt(i);
                i--;
                break;
                }
        }
    }
    return sb.toString();
    }

    public static String toggelcase(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            char ch=sb.charAt(i);

            if (ch>='A' && ch<='Z') {
                sb.setCharAt(i, (char)(ch+32));
            }
            else if (ch>='a' && ch<='z') {
                sb.setCharAt(i, (char)(ch-32));
            }
        }
        return sb.toString();
    }

    public static String addword(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.append(" Done");
        return sb.toString();
    }

    public static String midddle(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.insert(3, "Ok!");
        return sb.toString();
    }

    public static String replace(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.replace(0, 2, "A");
        return sb.toString();
    }

    public static String reversewords(String str){
        StringBuilder sb=new StringBuilder(str);
        String[] words=sb.toString().split(" ");
        sb.setLength(0);
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String compression(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int count=1;
            if(str.charAt(i) == ' ') continue;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
        }
        return sb.toString();
    }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Original String : ");
        System.out.print(str);
        System.out.println();
        System.out.println("After reversing string : ");
        System.out.println(reverse(str));
        System.out.println("Added word using append : ");
        System.out.println(addword(str));
        System.out.println("Added word in middle using insert : ");
        System.out.println(midddle(str));
        System.out.println("Replaced character using replace : ");
        System.out.println(replace(str));
        System.out.println("After removing vowels from string : ");
        System.out.println(vowels(str));
        System.out.println("After converting into upper/lower case using toggel case : ");
        System.out.println(toggelcase(str));
        System.out.println("After removing duplicate characters from string : ");
        System.out.println(duplicate(str));
        System.out.println("Reversing words in string : ");
        System.out.println(reversewords(str));
        System.out.println("Compressing string characters with counting its frequency : ");
        System.out.println(compression(str));
        sc.close();
    }
}
