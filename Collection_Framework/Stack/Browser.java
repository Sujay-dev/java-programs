package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Browser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        stack.push("google");
        stack.push("youtube");
        stack.push("github");

        stack.pop(); // used as back button

        System.out.println("Current page: " + stack.peek());
        sc.close();
    }
}
