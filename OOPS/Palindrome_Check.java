package OOPS.Class_Object;

import java.util.Scanner;

class Palindrome {
    private String str;

    Palindrome(){
        this("Invaild");
    }

    Palindrome(String str){
        setString(str);
    }

    public void setString(String str){
        if (str!=null && !str.isEmpty()) {
            this.str=str;
        }else{
            this.str="Invalid";
        }
    }

    public boolean isPalindrome(){

    String temp = str.replaceAll("[^a-zA-Z0-9]", "")
                     .toLowerCase();

    if(temp.isEmpty()){
        return false;
    }

    for(int i = 0; i < temp.length()/2; i++){

        if(temp.charAt(i) != temp.charAt(temp.length()-1-i)){
            return false;
        }
    }

    return true;
}

    public void display(){
        System.out.println("String : "+str);
        System.out.println("Palindrome : "+isPalindrome());
    }
}
public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        Palindrome p1=new Palindrome();
        p1.display();

        Palindrome p2=new Palindrome(str);
        if (p2.isPalindrome()) {
            System.out.println("Palindrome ");
        }else{
            System.out.println("Not palindrome");
        }
        p2.display();
        sc.close();
    }
}
