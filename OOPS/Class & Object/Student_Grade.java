package OOPS;

import java.util.Scanner;

class Students {
   private String name;
    private int marks;

    Students(String name, int marks){
        this.name=name;
        setmarks(marks);
    }

    public void setmarks(int marks){
        if (marks>=0 && marks<100) {
            this.marks=marks;
        }else{
            this.marks=0;
        }
    }

    public int getmarks(){
        return marks;
    }
    
    String grade(){
        if (marks>=90) {
            return "A";
        }else if (marks>=75) {
            return "B";
        }else if (marks>=50) {
            return "C";
        }else{
            return "Fail";
        }
    }

   public void display(){
        System.out.println("Name : "+name+" ,"+ "Marks : "+marks+ " ," +"Grade : "+ grade());
    }
}

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Enter your marks : ");
        int marks=sc.nextInt();

        Students s1=new Students(name,marks);
        System.out.println("Marks : "+ s1.getmarks());

        s1.display();
        sc.close();

    }
}
