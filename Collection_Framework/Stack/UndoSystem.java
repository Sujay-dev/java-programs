package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class UndoSystem {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        stack.push("Type A");
        stack.push("Type B");
        stack.push("Type C");

        stack.pop();
        
        for(int i=0; i<stack.size(); i++){
            System.out.println(stack.get(i));
        }
        sc.close();
    }
}
