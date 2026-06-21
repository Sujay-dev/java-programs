package Maps.WeakHashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

class Student1{
    private int id;
    private String name;

    Student1(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
public class StudentSystem2 {
    public static void main(String[] args) {
         WeakHashMap<Student1,String> map=new WeakHashMap<>();
          HashMap<Student1,String> map1=new HashMap<>();

        Student1 s1=new Student1(101, "Sujay");
        Student1 s2=new Student1(102, "Vedant");
        Student1 s3=new Student1(103, "Rohan");

        map1.put(s1, "Student 1");
        map1.put(s2, "Student 2");
        map1.put(s3, "Student 3");

        for (var s : map1.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }

        map.put(s1, "Student 1");
        map.put(s2, "Student 2");
        map.put(s3, "Student 3");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }

        s1=null;
        s2=null;
        s3=null;

        System.out.println("Wait for 10 sec...");
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            
        }

         for (var s : map1.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }

    }
}
