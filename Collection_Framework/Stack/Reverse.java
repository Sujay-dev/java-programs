package CollectionFramework.Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        stack.push('s');
        stack.push('u');
        stack.push('j');
        stack.push('a');
        stack.push('y');

        System.out.println(stack);

        while (!stack.isEmpty()) {
        System.out.println(stack.pop());
       }
       
    }
}
