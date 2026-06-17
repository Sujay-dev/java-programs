package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HighestMarks {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(101,82);
        map.put(102,78);
        map.put(103,67);
        map.put(104,68);
        map.put(105,70);
        map.put(106,63);
        
        int topStudent = -1;
        int maxMarks = Integer.MIN_VALUE;

        for (var e : map.entrySet()) {

        if (e.getValue() > maxMarks) {

        maxMarks=e.getValue();
        topStudent=e.getKey();
    }
}

System.out.println("Top Student ID: " + topStudent);
       System.out.println("Marks: " + maxMarks);
    }
}
