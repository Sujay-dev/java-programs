package OOPS;

import java.util.Scanner;

class Student {
      String name;
      int marks;

      void display(){
        System.out.println("Student "+name+" "+"Marks "+ marks);
      }
}
public class Student_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        Student s2=new Student();
        System.out.println("Enter student name : ");
        s1.name=sc.nextLine();
        System.out.println("Enter marks of student : ");
        s1.marks=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name : ");
        s2.name=sc.nextLine();
        System.out.println("Enter marks of student : ");
        s2.marks=sc.nextInt();

        s1.display();
        s2.display();
        sc.close();
    }
    
}
