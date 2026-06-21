package Maps.WeakHashmap;

import java.util.WeakHashMap;

class Student{
    private int id;
    private String name;

    Student(int id, String name){
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
public class StudentSystem {
    public static void main(String[] args) {
        WeakHashMap<Student,String> map=new WeakHashMap<>();

        Student s1=new Student(101, "Sujay");
        Student s2=new Student(102, "Vedant");
        Student s3=new Student(103, "Rohan");

        map.put(s1, "Student 1");
        map.put(s2, "Student 2");
        map.put(s3, "Student 3");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }
        
        System.out.println("Wait for 10 sec...");
        s2=null;
        System.gc();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }
    }
}
