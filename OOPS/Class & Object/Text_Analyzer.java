package OOPS.Class_Object;

import java.util.Scanner;

class Text {
    private String str;

    Text(){
        this("Invalid");
    }

    Text(String str){
        setText(str);
    }

    public void setText(String str){
        if (str!=null && !str.isEmpty()) {
            this.str=str;
        }else{
            this.str="Invalid";
        }
    }

    public int countVowels(){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        return count;
    }

    public int countWords(){

    int count = 0;
    boolean inWord = false;

    for(int i = 0; i < str.length(); i++){

        char ch = str.charAt(i);

        if(ch != ' ' && !inWord){
            count++;
            inWord = true;
        }

        else if(ch == ' '){
            inWord = false;
        }
    }

    return count;
}

    public String reverse(){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }

    public void display(){
        System.out.println("Text : "+str);
        System.out.println("Vowels : "+countVowels());
        System.out.println("Words : "+countWords());
        System.out.println("After reversing string : "+reverse());
    }
}
public class Text_Analyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        Text t1=new Text();
        t1.display();

        Text t2=new Text(str);
        System.out.println(t2.countVowels());
        System.out.println(t2.countWords());
        System.out.println(t2.reverse());
        t2.display();
        sc.close();
    }
}
