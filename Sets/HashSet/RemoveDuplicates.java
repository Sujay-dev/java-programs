package Sets.HashSet;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String [] args){
        HashSet<String> set=new HashSet<>();

        set.add("alice@gmail.com");
        set.add("bob@gmail.com");
        set.add("alice@gmail.com");
        set.add("john@gmail.com");
        set.add("bob@gmail.com");
        set.add("charlie@gmail.com");

        int count=0;
        System.out.println("Unique Emails: ");
        for (String s : set) {
            System.out.println(s);
            count++;
        }
        System.out.println();
        System.out.println("Total Unique Emails: " + count);
    }
}
