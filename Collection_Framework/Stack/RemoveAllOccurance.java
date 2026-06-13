package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAllOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(20);
        stack.push(50);

        Stack<Integer> stack2=new Stack<>();

        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        
        while (!stack2.isEmpty()) {
          int x=stack2.pop();

        if (x != 20) {
            stack.push(x);
        }   
        }

       System.out.println(stack);
    }
}
