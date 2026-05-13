package OOPS.Inheritance;

import java.util.Scanner;

class Employees {
    private String name;
    private int salary;

    Employees(String name,int salary){
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

    public void displayEmp(){
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
    }
}

class Manager extends Employees {
    private int bonus;
    
    Manager(String name, int salary, int bonus){
        super(name, salary);
        setBonus(bonus);
    }

    public void setBonus(int bonus){
        if (bonus>0) {
            this.bonus=bonus;
        }else{
            this.bonus=0;
        }
    }

    public int getBonus(){
        return bonus;
    }

    public int totalIncome(){
        return getSalary()+getBonus();
    }

    public void displayManager(){
        displayEmp();
        System.out.println("Bonus : "+getBonus());
        System.out.println("Total Income : "+totalIncome());
    }
}
public class Manager_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int salary=sc.nextInt();
        int bonus=sc.nextInt();

        Manager mn=new Manager(name, salary, bonus);
        mn.displayManager();
        sc.close();
    }
}
