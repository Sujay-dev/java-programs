package OOPS;

import java.util.Scanner;

class Students {
    String name;
    int marks;
    
    char grade(){
        if (marks > 100 || marks < 0){
            return 'X';
        }
        if (marks>=90) {
            return 'A';
        }else if (marks>=75) {
            return 'B';
        }else if (marks>=50) {
            return 'C';
        }else{
            return 'F';
        }
    }

    void display(){
        System.out.println("Name : "+name+" ,"+ "Marks : "+marks+ " ," +"Grade : "+ grade());
    }
}

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Students s1=new Students();
        System.out.println("Enter name of student : ");
        s1.name=sc.nextLine();
        System.out.println("Enter marks of student : ");
        s1.marks=sc.nextInt();

        s1.display();
        sc.close();

    }
}
