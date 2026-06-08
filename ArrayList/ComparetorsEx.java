package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class MyCompare implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2){
        return (o2.length() - o1.length());
    }
}

public class ComparetorsEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);

       list.sort(new MyCompare());
       System.out.println(list);

       List<String> list1=Arrays.asList("Banana","Apple","Date");
       list1.sort(new StringComparator());
       System.out.println(list1);
        sc.close();
    }
}
