package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SearchElement {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

         int search=sc.nextInt();
      boolean found=false;
      for(int i=0; i<stack.size(); i++){
        stack.search(search);
        if (stack.get(i)==search) {
            System.out.println("Found at index "+ i);
            found=true;
            break;
        }
      }
      if (!found) {
        System.out.println("Not Found");
      }
      System.out.println("Found at index (from top) " + stack.search(search));
    }
}
