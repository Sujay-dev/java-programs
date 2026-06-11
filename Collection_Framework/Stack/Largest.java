package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int max=Integer.MIN_VALUE;

        for(int i=0; i<stack.size(); i++){
            if (stack.get(i)>max) {
                max=stack.get(i);
            }
        }

        System.out.println("Largest Element is : " + max);
        sc.close();
    }
}
