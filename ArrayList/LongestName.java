package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList <String> names=new ArrayList<>();

        for(int i=0; i<3; i++){
            names.add(sc.nextLine());
        }

        String longest=names.get(0);

        for(String name : names){
            if (name.length() > longest.length()) {
                longest=name;
            }
        }

        System.out.println("Longest Name: " + longest);
        sc.close();
    }
}
