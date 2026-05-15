package OOPS.Inheritance;

import java.util.Scanner;

class Employ {
    private String name;
    private int salary;
    
    Employ(String name, int salary){
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
}

class Ceo extends Employ{
    private int bonus;

    Ceo(String name, int salary,int bonus){
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

    @Override
    public void display(){
        super.display();
        System.out.println("Bonus : "+getBonus());
        System.out.println("Total income : "+(getSalary()+bonus));
    }
}
public class Emp_Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int salary=sc.nextInt();
        int bonus=sc.nextInt();

        Ceo ceo=new Ceo(name, salary, bonus);
        ceo.display();
        sc.close();
    }
}
