package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        if (this.marks!=o.marks) {
            return Integer.compare(o.marks, this.marks);
        }
        if (this.attendance!=o.attendance) {
            return  Double.compare(o.attendance, this.attendance);
        }
        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        return Integer.compare(this.id, o.id);
    }
}
public class StudentSystem {
    public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
     
     Student s1=new Student(103,"Sujay",82,95.0);
     Student s2=new Student(101,"Rohan",68,60.0);
     Student s3=new Student(102,"Vedant",63,52.5);
     Student s4=new Student(105,"Vedant",82,54.7);
     Student s5=new Student(103,"Athrava",63,45.8);

     list.add(s1);
     list.add(s2);
     list.add(s3);
     list.add(s4);
     list.add(s5);

     Collections.sort(list );

     for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i).getId() + " " +list.get(i).getName() + " " + list.get(i).getMarks() + " " +list.get(i).getAttendance());
     }
    }
}
