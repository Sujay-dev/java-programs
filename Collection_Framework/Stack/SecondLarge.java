package CollectionFramework.Stack;

import java.util.Stack;

public class SecondLarge {
    public static void main(String[] args) {
         Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0; i<stack.size(); i++){
            if (stack.get(i)>max) {
                second=max;
                max=stack.get(i);
            }else if (stack.get(i)>second && stack.get(i)!=max) {
                second=stack.get(i);
            }
        }

        if (second==Integer.MIN_VALUE) {
            System.out.println("No second Largest Element");
        }else{
            System.out.println("Second Largest Element: "+ second);
        }
    }
}
