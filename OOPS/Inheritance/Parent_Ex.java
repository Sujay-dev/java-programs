package OOPS.Inheritance;

import java.util.Scanner;

class Person {
    //Parent Class;

    private String name; //Encapsulation

    Person(String name){ //Constructor
        setName(name);
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
}

class Student extends Person{
    //Child Class;

    private int marks; //Encapsulation

    Student(String name,int marks){
        super(name);
        setMarks(marks);
    }

    public void setMarks(int marks){
        if (marks>=0 && marks<=100) {
            this.marks=marks;
        }else{
            this.marks=0;
        }
    }

    public int getMarks(){
        return marks;
    }

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Marks : "+ getMarks());
    }
}
public class Parent_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int marks=sc.nextInt();
        Student st=new Student(name, marks);
        st.display();
        sc.close();
    }
}
