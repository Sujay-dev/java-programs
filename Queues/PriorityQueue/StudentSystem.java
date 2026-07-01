package Queues.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
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
}
public class StudentSystem {
    public static void main(String[] args) {
        PriorityQueue<Student> students=new PriorityQueue<>(Comparator.comparingInt(Student :: getMarks).reversed().thenComparing(Comparator.comparing(Student :: getName).thenComparing(Comparator.comparingInt(Student :: getId))));

        students.offer(new Student(101, "Sujay", 82));
        students.offer(new Student(102, "Suyash", 68));
        students.offer(new Student(103, "Rohan", 68));
        students.offer(new Student(104, "Vedant", 63));
        students.offer(new Student(105, "Kunal", 80));

        Student highest=students.peek();
        System.out.println("Student with Highest Marks: ID- " + highest.getId() + " Name- " + highest.getName() + " Marks- " + highest.getMarks());

        System.out.println(); 

         while(!students.isEmpty()){
            Student stud=students.poll();
            System.out.println("ID- " + stud.getId() +  " Name- " + stud.getName() + " Marks- " + stud.getMarks());
        }
    }
}
