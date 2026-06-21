package Maps.LinkedHashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student_Marks_Analytics_System {
    public static void main(String[] args) {
        String data ="Sujay:82, Vedant:63, Rohan:82, Suyash:68, " +"Parth:70, Athrava:68, Kunal:70, Sahil:82";

        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

        // STORE Students TASK 1;
        String[] parts=data.split(", ");
        for (String s : parts) {
           String[] key=s.split(":");

           String name=key[0].trim();
           int marks=Integer.parseInt(key[1].trim());

           map.put(name, marks);
        }

        System.out.println("---Student List With Marks---");
        int max=Integer.MIN_VALUE;
        String top="-1";
        for (var s : map.entrySet()) {
           if (s.getValue()>max) {
            max=s.getValue();
            top=s.getKey();
           }
           System.out.println(s.getKey() + " -> " + s.getValue() );
        }

        System.out.println();

        // HIGHEST Scorer TASK 2;
        System.out.println("Student with highest marks: ");
        System.out.println("Name: " + top);
        System.out.println("Marks: " + max);

        LinkedHashMap<Integer,Integer> map2=new LinkedHashMap<>();

        for(Integer s: map.values()){
            if (!map2.containsKey(s)) {
                map2.put(s, 1);
            }else{
                map2.put(s, map2.get(s)+1);
            }
           // map2.put(s, map2.getOrDefault(s, 0)+1); before i writed map it should be map2
        }

        System.out.println();

        // Frequency of Marks TASK 3
        System.out.println("---Marks With Frequency---");
        int freq=Integer.MIN_VALUE;
        int val=-1;
        for (var s : map2.entrySet()) {
            if (s.getValue()>freq) {
                freq=s.getKey();
                val=s.getValue();
            }
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        // Most frequent Marks TASK 4;
        System.out.println("Most Frequent Marks: ");
        System.out.println("Common Marks: " +freq);
        System.out.println("Frequency: "+ val);

        System.out.println();

        LinkedHashMap<Integer,ArrayList<String>> map3=new LinkedHashMap<>();

        for (var s : map.entrySet()) {
            String name=s.getKey();
            int marks=s.getValue();

            if (!map3.containsKey(marks)) {
                map3.put(marks, new ArrayList<>());
            }

            map3.get(marks).add(name);
        }

        System.out.println();

        // Group Student with marks TASk 5;
        System.out.println("---Student grouped by Marks---");
        for (var s : map3.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }

        System.out.println();
        
        // Print Group with value greater than one;
        System.out.println("---Marks that belong to more than one Student---"); // here before i compared getkey but now compared value.size because it is list
        for (var s : map3.entrySet()) {
            if (s.getValue().size()>1) {
                System.out.println(s.getKey() + " : " + s.getValue());
            }
        }
    }
}
