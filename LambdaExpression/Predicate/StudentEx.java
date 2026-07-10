package LambdaExpression.Predicate;

import java.util.function.Predicate;

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
        Predicate<Student> validMarks=s-> s.getMarks()>0 && s.getMarks()<=100;
        Predicate<Student> pass=s-> s.getMarks()>=35;

        Predicate<Student> eligible=validMarks.and(pass);

        Student s1=new Student(101,"Sujay",82);
        Student s2=new Student(102,"Suyash",68);
        Student s3=new Student(103,"Athrava",70);
        Student s4=new Student(104,"Vedant",62);
        Student s5=new Student(105,"Prathmesh",68);

        System.out.println(s1.getName() + " (Pass): " + eligible.test(s1));
        System.out.println(s2.getName() + " (Pass): " + eligible.test(s2));
        System.out.println(s3.getName() + " (Pass): " + eligible.test(s3));
        System.out.println(s4.getName() + " (Pass): " + eligible.test(s4));
        System.out.println(s5.getName() + " (Pass): " + eligible.test(s5));
    }
}
