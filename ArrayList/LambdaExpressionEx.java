package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LambdaExpressionEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);

       list.sort((a,b)-> b-a); //for desending;
       System.out.println(list);

       list.sort(null); //for assending;
       System.out.println(list);

       List<String> list1=Arrays.asList("Banana","Apple","Date");
       list1.sort((a,b) -> a.length() - b.length()); // for assending;
       System.out.println(list1);

       list1.sort((a,b) -> b.length()-a.length()); //for desending;
       System.out.println(list1);
        sc.close();
    }
}
