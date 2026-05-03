package OOPS;

import java.util.Scanner;

class Emp {
    private String name;
    private int salary;

    Emp(){
        this("Unknown",0);
    }

    Emp(String emp){
        this(emp,0);
    }
    public void setName(String name){
        if(name != null && !name.isEmpty())
            this.name = name;
        else
            this.name = "Unknown";
    }

    public void setSalary(int salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            this.salary=0;
        }
    }

    Emp(String emp,int salary){
        setName(emp);
        setSalary(salary);
    }

    public void increse(int percent){
        if (percent>0) 
        salary+=salary*percent/100;
    }

    public void display(){
        System.out.println("Name : "+ name + " "+ "Salary : "+ salary);
    }
}

public class Emp_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name : ");
        String name=sc.nextLine();
        System.out.println("Enter Salary : ");
        int salary=sc.nextInt();

        Emp e1=new Emp(name);
        e1.display();

        Emp e2=new Emp(name,salary);
        e2.increse(10);
        e2.display();
        sc.close();
    }
}
