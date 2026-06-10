package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaderElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        list.add(16);
        list.add(17);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
       
        System.out.println(list);
        

        for(int i=0; i<list.size(); i++){
            boolean leader=true;
            for(int j=i+1; j<list.size(); j++){
                if (list.get(j)>list.get(i)) {
                    leader=false;
                    break;
                }
            }

            if (leader) {
                System.out.println(list.get(i));
            }
        }
        sc.close();
    }
}
