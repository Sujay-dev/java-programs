package LambdaExpression.Function;

import java.util.function.Function;

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
        Function<Student,String> name=x->x.getName();
        Function<Student,Integer> marks=x->x.getMarks();
        Function<Student,Boolean> isPass=x->x.getMarks()>=35;

        Student s1=new Student(101, "Sujay", 82);
        System.out.println("Name: " + name.apply(s1));
        System.out.println("Marks: " + marks.apply(s1));
        System.out.println("Pass: " + isPass.apply(s1));
    }
}
