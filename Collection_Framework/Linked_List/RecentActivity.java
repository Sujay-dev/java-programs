package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class RecentActivity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> list1=new LinkedList<>();

        list1.addLast("Login");
        list1.addLast("View Profile");
        list1.addLast("Watch Videos");
        list1.addLast("Change Password");
        list1.addLast("LogOut");

        System.out.println(list1);
        if (list1.size()==5) {
         list1.removeFirst();   
        }

        list1.addLast("Upload Image");
        System.out.println(list1);
        sc.close();
    }
}
