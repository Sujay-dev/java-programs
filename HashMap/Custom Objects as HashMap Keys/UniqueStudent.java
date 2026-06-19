package HashMap;

import java.util.Scanner;
import java.util.HashMap;

class Student{
    private int id;
    private String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Student)) return false;
        Student other=(Student) obj;
        return this.id==other.id;
    }

    @Override
    public int hashCode(){
        return this.id;
    }
}

public class UniqueStudent{
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Student,String> map=new HashMap<>();

        Student s1=new Student(101, "Sujay");
        Student s2=new Student(101, "SujayK");

        map.put(s1,"Student 1");
        map.put(s2,"Student 2");

        System.out.println(map.size());

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }
        sc.close();
    }
    
}