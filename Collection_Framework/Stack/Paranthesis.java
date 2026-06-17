package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        for(int i=0; i<6; i++){
            stack.push(sc.nextLine());
        }
        Stack<Character> stack2=new Stack<>();
        boolean balance=true;

        for(int i=0; i<stack.size(); i++){
            if (stack.get(i).equals("(")) {
                stack2.push('(');
            }

            if (stack.get(i).equals(")")) {
                if (stack2.isEmpty()) {
                    System.out.println("Not Balanced");
                    balance=false;
                    break;
                }else{
                    stack2.pop();
                }
            }
        }

        if (balance && stack2.isEmpty()) {
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
