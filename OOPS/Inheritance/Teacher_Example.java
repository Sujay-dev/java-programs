package OOPS.Inheritance;

import java.util.Scanner;

class Persons {
    private String name;
    private int age;

    Persons(String name, int age){
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
    public void displayPerson(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
    }
}

class Teacher extends Persons{
    private String subject;
    private int salary;

    Teacher(String name,int age, String subject, int salary){
        super(name, age);
        setSubject(subject);
        setSalary(salary);
    }

    public void setSubject(String subject){
        if (subject!=null && !subject.isEmpty()) {
            this.subject=subject;
        }else{
            this.subject="Invalid";
        }
    }

    public String getSub(){
        return subject;
    }

    public void setSalary(int salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            this.salary=0;
        }
    }

    public int getSalary(){
        return salary;
    }

    public int annualSalary(){
        int year=12;
        return salary*year;
    }

    public void displayTeacher(){
        displayPerson();
        System.out.println("Subject : "+getSub());
        System.out.println("Salary : "+getSalary());
        System.out.println("Annual Income : "+annualSalary());
    }
}
public class Teacher_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String sub=sc.nextLine();
        int salary=sc.nextInt();

        Teacher teacher=new Teacher(name, age, sub, salary);
        teacher.displayTeacher();
        sc.close();
    }
}
