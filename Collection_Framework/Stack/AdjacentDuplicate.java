package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class AdjacentDuplicate {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        stack.push("A");
        stack.push("A");
        stack.push("B");
        stack.push("B");
        stack.push("C");
        
        int i=0;
        while (i<stack.size()-1) {
            if (stack.get(i).equals(stack.get(i+1))) {
               // stack.remove(i);
                stack.remove(i+1);
                stack.removeElementAt(i);
            }else{
                i++;
            }
        }
        System.out.println(stack);
    }
}
