package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GreaterElement {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(15);
        stack.push(3);
        stack.push(20);

        for(int i=0; i<stack.size(); i++){
            int greater=-1;
            for(int j=i+1; j<stack.size(); j++){
                if (stack.get(j)>stack.get(i)) {
                    greater=stack.get(j);
                    break;
                }
            }
            System.out.println(stack.get(i) + " -> " + greater);
            }
    }
}
