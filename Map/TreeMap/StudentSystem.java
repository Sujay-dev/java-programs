package Maps.Treemap;

import java.util.TreeMap;

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int marks;

    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    @Override
    public int compareTo(Student s){
        if(this.marks!=s.marks)
            return Integer.compare(s.marks, this.marks);
        if(!this.name.equals(s.name))
            return this.name.compareTo(s.name);
        return Integer.compare(this.id, s.id);
    }
}
public class StudentSystem {
    public static void main(String[] args) {
        TreeMap<Student,String> map=new TreeMap<>();

        Student s1=new Student(104, "Sujay", 82);
        Student s2=new Student(103, "Suyash", 67);
        Student s3=new Student(101, "Rohan", 68);
        Student s4=new Student(102, "Vedant", 63);

        map.put(s4, "Student");
        map.put(s3, "Student");
        map.put(s1, "Student");
        map.put(s2, "Student");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " " + s.getKey().getName() + " " + s.getKey().getMarks()  +" -> "+ s.getValue());
        }
    }
}
