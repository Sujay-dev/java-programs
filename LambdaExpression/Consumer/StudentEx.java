package LambdaExpression.Consumer;

import java.util.function.Consumer;

class Student{
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
public class StudentEx {
    public static void main(String[] args) {
        Consumer<Student> student=x-> System.out.println(x.getId() + " " + x.getName() + " " + x.getMarks());

        Student s1=new Student(101, "Sujay", 82);
        Student s2=new Student(102, "Suyash", 68);
        Student s3=new Student(103, "Vedant", 62);
        Student s4=new Student(104, "Rohan", 68);
        Student s5=new Student(105, "Parth", 80);

        student.accept(s1);
        student.accept(s2);
        student.accept(s3);
        student.accept(s4);
        student.accept(s5);
    }
}
