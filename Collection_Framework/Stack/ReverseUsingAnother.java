package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseUsingAnother {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        Stack<String> copy=new Stack<>();

        while (!stack.isEmpty()) {
            copy.push(stack.pop());
        }
        System.out.println(copy);
    }
}
