package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudDept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        
        map.put("Sujay", "Computer");
        map.put("Vedant","Electronics" );
        map.put("Sahil", "IT");
        map.put("Kunal", "AI");
        map.put("Satyam", "DataScience");
        map.put("Rohan", "Computer");
        map.put("Athrava","Electronics" );
        map.put("Parth", "AI");
        map.put("Panyajeet", "DataScience");

        HashMap<String,ArrayList<String>> deptmap=new HashMap<>();

        for (var i : map.entrySet()) {
           String name=i.getKey();
           String dept=i.getValue();

           if (!deptmap.containsKey(dept)) {
            deptmap.put(dept, new ArrayList<>());
           }

           deptmap.get(dept).add(name);
        }

        for (var s : deptmap.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}