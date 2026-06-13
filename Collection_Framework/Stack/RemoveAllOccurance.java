package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAllOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(3);
        stack.push(20);

        System.out.println(stack);

        System.out.println();

        for(int i=0; i<stack.size(); i++){
            if (stack.get(i)==20) {
                stack.remove(i);
                i--;
            }
        }

        System.out.println(stack);
    }
}
