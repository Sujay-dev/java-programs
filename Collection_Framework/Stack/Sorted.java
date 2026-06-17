package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(3);
        stack.push(30);

        System.out.println(stack);

        System.out.println();

        boolean sorted=true;
        for(int i=0; i<stack.size()-1; i++){
            if (stack.get(i)>stack.get(i+1)) {
                sorted=false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
