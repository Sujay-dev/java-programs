package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class RemoveDuplicateConsecutive {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);

        int i=0;

        while (i<list.size()-1) {
            if (list.get(i).equals(list.get(i+1))) {
                list.remove(i+1);
            }else{
                i++;
            }
        }
        System.out.println(list);
    }
}
