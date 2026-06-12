package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        stack.push("Best");
        stack.push("The");
        stack.push("Is");
        stack.push("Sujay");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}
