package OOPS.Inheritance;

import java.util.Scanner;

class SchoolBoy {
    private String name;
    private int age;
    
    SchoolBoy(String name, int age){
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

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
    }
}

class Students extends SchoolBoy{
    private char grade;
    private int marks;
    Students(String name,int age, char grade,int marks){
        super(name, age);
        setGrade(grade);
        setMarks(marks);
    } 

    public void setGrade(char grade){
        if (grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F') {
            this.grade=grade;
        }else{
            this.grade='#';
        }
    }

    public void setMarks(int marks){
        if (marks>=0 && marks<=100) {
            this.marks=marks;
        }else{
            this.marks=0;
        }
    }

    public boolean ispassed(){
        if (marks<35) {
            return false;
        }
        return true;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Grade : "+grade);
        System.out.println("Marks : "+marks);
        if (ispassed()) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

class Teachers extends SchoolBoy{
    private String subject;
    private int salary;
    private int experience;

    Teachers(String name, int age,String subject, int salary,int experience){
        super(name, age);
        setSub(subject);
        setSalary(salary);
        setexperience(experience);
    }
    public void setSub(String sub){
        if (sub!=null && !sub.isEmpty()) {
            this.subject=sub;
        }else{
            this.subject="Unknown";
        }
    }

    public void setSalary(int salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            this.salary=0;
        }
    }

    public void setexperience(int experience){
        if (experience>0) {
            this.experience=experience;
        }else{
            this.experience=0;
        }
    }

    public int yearsLeft(){
        int retirement=60;
        return (retirement-getAge());
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Subject : "+subject);
        System.out.println("Salary : "+salary);
        System.out.println("Experience : "+experience);
        System.out.println("Years left for retirment : "+yearsLeft());
    }
}
public class School_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();
        char grade=sc.next().charAt(0);
        int marks=sc.nextInt();
        sc.nextLine();
        String subject=sc.nextLine();
        int salary=sc.nextInt();
        int experinece=sc.nextInt();

        Students student=new Students(name, age, grade, marks);
        student.display();

        Teachers teacher=new Teachers(name, age, subject, salary, experinece);
        teacher.display();
        sc.close();
    }
}
