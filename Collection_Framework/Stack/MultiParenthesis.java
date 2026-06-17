package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class MultiParenthesis {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Stack<String> stack=new Stack<>(); 
       stack.push("("); 
       stack.push("{"); 
       stack.push("["); 
       stack.push("]"); 
       stack.push("}"); 
       stack.push(")"); 

       Stack<Character> stack2=new Stack<>(); 
       boolean balanced=true; 

       for(int i=0; i<stack.size(); i++){ 
        if (stack.get(i).equals("(")) { 
            stack2.push('('); 
        } 
        else if (stack.get(i).equals("{")) {
                 stack2.push('{'); 
        } else if (stack.get(i).equals("[")) {
                 stack2.push('['); 
                } 
        
        if (stack.get(i).equals(")")) {
            if (stack2.isEmpty()) {
                System.out.println("Not Balanced");
                balanced=false;
                break;
            }
            
            if (stack2.peek()!='(') {
                System.out.println("Not Balanced");
                balanced=false;
                break;
            }
            else{
                stack2.pop();
            }
        }

        if (stack.get(i).equals("}")) {
            if (stack2.isEmpty()) {
                System.out.println("Not Balanced");
                balanced=false;
                break;
            }
            
            if (stack2.peek()!='{') {
                System.out.println("Not Balanced");
                balanced=false;
                break;
            }
            else{
                stack2.pop();
            }
        }

        if (stack.get(i).equals("]")) {
            if (stack2.isEmpty()) {
                System.out.println("Not Balanced");
                balanced=false;
                break;
            }
            
            if (stack2.peek()!='[') {
                System.out.println("Not Balanced");
                balanced=false;
                break;
            }
            else{
                stack2.pop();
            }
        }
        } 
        if (balanced && stack2.isEmpty()) {
             System.out.println("Balanced"); 
         }else{
            System.out.println("Not Balanced"); 
        } 
                            
    }
}
