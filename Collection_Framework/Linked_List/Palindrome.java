package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(20);
        linkedList.addLast(10);

        boolean palin=true;
       for(int i=0; i<linkedList.size()/2; i++){
        if (linkedList.get(i)!=linkedList.get(linkedList.size()-1-i)) {
            palin=false;
            break;
        }
       }

       if (palin) {
        System.out.println("Paindrome");
       }else{
        System.out.println("Not Plaindrome");
       }
        sc.close();
    }
}
