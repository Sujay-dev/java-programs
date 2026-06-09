package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class MoveZero {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(0);
        list.add(20);
        list.add(0);
        list.add(30);
        list.add(40);

        int index=0;

       for(int i=0; i<list.size(); i++){
        if (list.get(i)!=0) {
             list.set(index, list.get(i));
             index++;
        }
       }

       while (index<list.size()) {
       list.set(index, 0);
       index++;
       }

       for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i) + " ");
       }
       
    }
}
