package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(10);
        stack.push(3);
        stack.push(10);

        int input=sc.nextInt();
        boolean foundInput=false;
        for(int i=0; i<stack.size(); i++){
            boolean found=false;
            for(int j=0; j<i; j++){
                if (stack.get(i).equals(stack.get(j))) {
                 found=true;
                break;   
                }
            }
            if (found) {
            continue;
            }

            int count=1;

            for(int k=i+1; k<stack.size(); k++){
                if (stack.get(i).equals(stack.get(k))) {
                    count++;
                }
            }
            if (input==stack.get(i)) {
                 System.out.println(input + " -> " + count);
                 foundInput=true;
                 break;
            }
        }
        if (!foundInput) {
            System.out.println("Number not in Stack");
        }
    }
}
