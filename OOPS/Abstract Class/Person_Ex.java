package Revision;

import java.util.Scanner;

abstract class Person{
    private String name;
    private int age;

    Person(String name, int age){
        setName(name);
        setAge(age);
    }

     public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age>0) {
            this.age=age;
        }else{
            this.age=0;
        }
    }

    public int getAge(){
        return age;
    }

    abstract String getRole();
}

class Student extends Person{
    Student(String name, int age){
        super(name, age);
    }

    @Override
    public String getRole(){
        return "Student";
    }
}

class Teacher extends Person{
    Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public String getRole(){
        return "Teacher";
    }
}
public class Person_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String studentName=sc.nextLine();
        System.out.println("Enter Student Age: ");
        int studentAge=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Teacher Name: ");
        String teacherName=sc.nextLine();
        System.out.println("Enter Teacher Age: ");
        int teacherAge=sc.nextInt();

        Person p[]=new Person[2];
        p[0]=new Student(studentName, studentAge);
        p[1]=new Teacher(teacherName, teacherAge);

        for(int i=0; i<p.length; i++){
            System.out.println("Name: " + p[i].getName() + " Age: " +  p[i].getAge() + " Role: " + p[i].getRole());
        }
        sc.close();
    }
}
