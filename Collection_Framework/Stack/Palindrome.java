package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        stack.push("b");
        stack.push("a");
        stack.push("d");
        stack.push("a");
        stack.push("b");

        boolean palin=true;
        for(int i=0; i<stack.size()/2; i++){
           // stack.pop();
            if (!stack.get(i).equals(stack.get(stack.size()-1-i))) {
                palin=false;
                break;
            }
        }

        if (palin) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
