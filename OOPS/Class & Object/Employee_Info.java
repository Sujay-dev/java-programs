package OOPS;

import java.util.Scanner;

class Employee {
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        setSalary(salary);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(int salary){
        if (salary>0) 
        this.salary=salary;
        else this.salary=0;
        }

        public int getSalary(){
            return salary;
        }
    
    public void display(){
        System.out.println("Employee "+name+" "+"Salary "+ salary );
    }

   public void increasesalary(int percent){
    if (percent>0) 
        salary+=salary*percent/100;
    }
}
public class Employee_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee name : ");
        String name=sc.nextLine();
        System.out.println("Enter salary of employee : ");
        int salary=sc.nextInt();

        Employee e1=new Employee(name,salary);
        e1.display();
        System.out.println("Salary incresed : ");
        e1.increasesalary(10);
        e1.display();
        sc.close();
    }
}
