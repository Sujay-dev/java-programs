package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

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
public class StudentSystem {
    public static void main(String[] args) {
       LinkedHashMap<Student,String> map = new LinkedHashMap<>();

       Student s1 = new Student(101,"Sujay");
       Student s2 = new Student(102,"Vedant");
       Student s3 = new Student(101,"SujayK");

       map.put(s1,"Student 1");
       map.put(s2,"Student 2");
       map.put(s3,"Student 3");

        System.out.println(map.size());

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " : " + s.getValue());
        }
    }
}
