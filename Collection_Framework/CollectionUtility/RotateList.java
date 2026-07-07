package CollectionUtility;

import java.util.Collections;
import java.util.LinkedList;

public class RotateList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("Song 1");
        list.add("Song 2");
        list.add("Song 3");
        list.add("Song 4");
        list.add("Song 5");
        list.add("Song 6");

        System.out.println("LIst: " + list);

        Collections.rotate(list, 2);

        System.out.println("\nRotate right by 2: " + list);

        Collections.rotate(list, -3);

        System.out.println("\nRotate left by 3: " + list);
        
    }
}
