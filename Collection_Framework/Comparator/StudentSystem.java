package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private int id;
    private String name;
    private int marks;
    private double attendance;

    Student(int id,String name,int marks,double attendance){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.attendance=attendance;
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
    public double getAttendance(){
        return attendance;
    }
}
public class StudentSystem {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();

        Student s1=new Student(101, "Sujay Kamble", 82,95.0);
        Student s2=new Student(102, "Vedant Kanase", 63,50.0);
        Student s3=new Student(103, "Rohan Jagtap", 68,40.5);
        Student s4=new Student(104, "Suyash Desai", 67,45.6);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        list.sort(Comparator.comparing(Student :: getMarks,Comparator.reverseOrder()).thenComparing(Student :: getAttendance,Comparator.reverseOrder()).thenComparing(Student :: getName));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getMarks() + " " + list.get(i).getAttendance() + "%");
        }
    }
}
