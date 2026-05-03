package OOPS;

import java.util.Scanner;

class Boy {
    private String name; 
    private int marks;

    Boy(){
        this("Unknown",0);
    }

    Boy(String name){
        this(name,0);
    }

    Boy(String name, int marks){
        setName(name);
        setMarks(marks);
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public void setMarks(int marks){
        if (marks>=0 && marks<=100) {
            this.marks=marks;
        }else{
            marks=-1;
        }
    }

    public String grades(){
        if (marks>=90) {
            return "A";
        }else if (marks>=75) {
            return "B";
        }else if (marks>=50) {
            return "C";
        }
        else if (marks>=35) {
            return "D";
        }
        return"Fail";
    }

    public void display(){
        System.out.println("Student : "+ name + " Marks : "+ marks + " "+ "Grade : "+ grades());
    }
}

public class Student_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String name=sc.nextLine();
        int marks=sc.nextInt();

        Boy s0=new Boy();
        System.out.println(s0.grades());
        s0.display();

        Boy s1=new Boy(name);
        System.out.println(s1.grades());
        s1.display();

        Boy s2=new Boy(name,marks);
        System.out.println(s2.grades());
        s2.display();
        sc.close();
    }
}
