package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(10);
        list.addLast(30);
        list.addLast(20);
        list.addLast(40);

        System.out.println(list);

        //System.out.println(list.removeFirstOccurrence(list));

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}
