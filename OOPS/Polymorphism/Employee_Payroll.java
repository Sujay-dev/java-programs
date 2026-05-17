package OOPS.Polymorphism;

import java.util.Scanner;

class Employee {
    private String name;
    private int salary;
    
    Employee(String name, int salary){
        setName(name);
        setSalary(salary);
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

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
    }

    public void calculatePay(){}
}

class Manager extends Employee {
    
    Manager(String name,int salary){
        super(name, salary);
    }

    @Override
    public void calculatePay(){
        super.display();
        int finalPay=getSalary()*20/100;
        System.out.println("Final Pay for Manager : "+(getSalary()+finalPay));
    }
}

class Developer extends Employee {
    
    Developer(String name, int salary){
        super(name, salary);
    }

    @Override
    public void calculatePay(){
        super.display();
         int finalPay=getSalary()*15/100;
        System.out.println("FInal Pay for developer : "+(getSalary()+finalPay));
    }
}

class Intern extends Employee {
    
    Intern(String name, int salary){
        super(name, salary);
    }

    @Override
    public void calculatePay(){
        super.display();
        System.out.println("Final pay for Intern : "+getSalary());
    }
}
public class Employee_Payroll {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         String name=sc.nextLine();
         int salary=sc.nextInt();

         Employee e[]=new Employee[3];
         e[0]=new Manager(name, salary);
         e[1]=new Developer(name, salary);
         e[2]=new Intern(name, salary);

         for(int i=0; i<e.length; i++){
            e[i].calculatePay();
            System.out.println();
         }
         sc.close();
    }
}
