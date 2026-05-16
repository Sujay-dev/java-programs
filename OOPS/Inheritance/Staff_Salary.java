package OOPS.Inheritance;

import java.util.Scanner;

class Staff {
    private String name;
    private int salary;
    
    Staff(String name,int salary){
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

    public void setSalary(int salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            this.salary=0;
        }
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void calculateSalary(){
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
    }
}

class FullTime extends Staff{
    FullTime(String name,int salary){
        super(name, salary);
    }

    @Override
    public void calculateSalary(){
        super.calculateSalary();
        System.out.println("Bonus : 5000");
        System.out.println("Basesalary : "+(getSalary()+5000));
    }
}

class PartTime extends Staff{
    private int hours;
    
    PartTime(String name,int salary,int hours){
        super(name, salary);
        setHours(hours);
    }

    public void setHours(int hours){
        if (hours>0) {
            this.hours=hours;
        }else{
            this.hours=0;
        }
    }

    @Override
    public void calculateSalary(){
        super.calculateSalary();
        int hourRate=getSalary()/30;
        int perHour=hourRate/8;
        System.out.println("Hours worked : "+hours);
        System.out.println("Basesalary : "+(perHour*hours));
    }
}

class Contract extends Staff{
    private int tax;
    
    Contract(String name, int salary,int tax){
        super(name, salary);
        setTax(tax);
    }

    public void setTax(int tax){
        if (tax>0) {
            this.tax=tax;
        }else{
            this.tax=0;
        }
    }

    @Override
    public void calculateSalary(){
        super.calculateSalary();
        int deduction=getSalary()*tax/100;
        System.out.println("Deduction : "+deduction);
        System.out.println("Basesalary : "+(getSalary()-deduction));
    }
}

public class Staff_Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int salary=sc.nextInt();
        int hours=sc.nextInt();
        int tax=sc.nextInt();

        FullTime fullTime=new FullTime(name, salary);
        fullTime.calculateSalary();

        PartTime partTime=new PartTime(name, salary, hours);
        partTime.calculateSalary();

        Contract contract=new Contract(name, salary, tax);
        contract.calculateSalary();
        sc.close();
    }
}
