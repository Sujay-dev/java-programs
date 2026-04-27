package OOPS;

import java.util.Scanner;

class Employee {
    String name;
    int salary;

    void display(){
        System.out.println("Employee "+name+" "+"Salary "+ salary );
    }

    void increasesalary(int percent){
        int increase=salary*percent/100;
        salary+=increase;
    }
}
public class Employee_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Employee e1=new Employee();
        System.out.println("Enter Employee name : ");
        e1.name=sc.nextLine();
        System.out.println("Enter salary of employee : ");
        e1.salary=sc.nextInt();

        e1.display();
        e1.increasesalary(10);
        e1.display();
        sc.close();
    }
}
