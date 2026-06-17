  package HashMap;



import java.util.ArrayList;

import java.util.HashMap;

import java.util.Scanner;



public class GroupByMarks {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        HashMap<String,Integer> map=new HashMap<>();

        map.put("Sujay", 82);

        map.put("Vedant",63 );

        map.put("Sahil", 82);

        map.put("Kunal", 70);

        map.put("Satyam", 82);

        map.put("Rohan", 68);

        map.put("Athrava",63);

        map.put("Parth", 70);

        map.put("Panyajeet", 68);



        HashMap<Integer,ArrayList<String>> map2=new HashMap<>();



        for (var s : map.entrySet()) {

           String name=s.getKey();

           int marks=s.getValue();



           if (!map2.containsKey(marks)) {

            map2.put(marks, new ArrayList<>());

           }



           map2.get(marks).add(name);

        }



        for (var s : map2.entrySet()) {

            System.out.println(s.getKey() + " : " + s.getValue());

        }

    }

}