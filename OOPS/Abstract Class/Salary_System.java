package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Employee {
    abstract int calculateSalary();   
}

class FullTimeEmp extends Employee {
    
    private int salary;
    FullTimeEmp(int salary){
        setSalary(salary);
    }

    public void setSalary(int salary){
        if (salary<=0) {
            this.salary=0;
        }else{
            this.salary=salary;
        }
    }
    @Override
    public int calculateSalary(){
        return salary;
    }
}

class PartTimeEmp extends Employee {
    
    private int hours;
    private int rate;
    PartTimeEmp(int hours,int rate){
        setValues(hours, rate);
    }

    public void setValues(int hours,int rate){
        if (hours<=0 || rate<=0) {
            this.hours=0;
            this.rate=0;
        }else{
            this.hours=hours;
            this.rate=rate;
        }
    }
    @Override
    public int calculateSalary(){
        return hours*rate;
    }
}

class Intern extends Employee {
    private int stipend;

    Intern(int stipend){
        setStipend(stipend);
    }

    public void setStipend(int stipend){
        if (stipend<=0) {
            this.stipend=0;
        }else{
            this.stipend=stipend;
        }
    }
    @Override
    public int calculateSalary(){
        return stipend;
    }
}
public class Salary_System {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int salary=sc.nextInt();
         int hours=sc.nextInt();
         int rate=sc.nextInt();
         int stipend=sc.nextInt();

         Employee e[]=new Employee[3];
         e[0]=new FullTimeEmp(salary);
         e[1]=new PartTimeEmp(hours, rate);
         e[2]=new Intern(stipend);

         for(int i=0; i<e.length; i++){
            System.out.println(e[i].calculateSalary());
         }
         sc.close();
    }
}
