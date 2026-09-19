package Revision_2;

import java.lang.classfile.instruction.StackInstruction;

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override 
    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override 
    public void sound(){
        System.out.println("Cat meows");
    }
}

abstract class EmployeeAB {
    private int id;
    private String name;
    private int salary;
    
    EmployeeAB(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    abstract int calculateBonus();
    abstract void displayDetails();

    public int getAnnualSalary(){
        return salary*12;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public  int getSalary(){
        return  salary;
    }
}

class PermnantEmp extends EmployeeAB{
    PermnantEmp(int id,String name,int salary){
        super(id, name, salary);
    }
    @Override
    public int calculateBonus(){
        return (getSalary()*15)/100;
    }
    @Override 
    public void displayDetails(){
        System.out.println("=======Permanant Employee=======");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Annual Salary: " + getAnnualSalary());
        System.out.println("Bonus: " + calculateBonus());
    }
}

class ContractEmp extends EmployeeAB{
    ContractEmp(int id,String name,int salary){
        super(id, name, salary);
    }
    @Override 
    public int calculateBonus(){
        return (getSalary()*5)/100;
    }
    @Override 
    public void displayDetails(){
        System.out.println("======Contract Employee=====");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Annual Salary: " + getAnnualSalary());
        System.out.println("Bonus: " + calculateBonus());
    }
}

abstract class Food{
    private String name;
    private int price;
    private String prepTime;

    Food(String name, int price,String prepTime){
        this.name=name;
        this.price=price;
        this.prepTime=prepTime;
    }

    public String getName(){
        return  name;
    }
    public int getPrice(){
        return price;
    }
    public String getTime(){
        return prepTime;
    }
    abstract void prepare();
    abstract void cook();
    abstract void serve();

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Prepration Time: " + getTime());
        prepare();
        cook();
        serve();
    }
}

class Pizza extends Food{
    Pizza(String name,int price,String prepTime){
        super(name, price, prepTime);
    }
    @Override 
    public void prepare(){
        System.out.println("Prepared using Flour,Water,yeast,salt, sugar and Olive Oil");
    }
    @Override 
    public void cook(){
        System.out.println("Pizza Cooked in Oven");
    }
    @Override 
    public void serve(){
        System.out.println("Served with Extra cheese and topins");
    }
}
class Burger extends Food{
    Burger(String name,int price,String prepTime){
        super(name, price, prepTime);
    }
    @Override 
    public void prepare(){
        System.out.println("Prepared using Bune,Black paper,patty,salt, cheese");
    }
    @Override 
    public void cook(){
        System.out.println("Burger Cooked with Outdoor Grill");
    }
    @Override 
    public void serve(){
        System.out.println("Served with Sauce and topins");
    }
}
class Pasta extends Food{
    Pasta(String name,int price,String prepTime){
        super(name, price, prepTime);
    }
    @Override 
    public void prepare(){
        System.out.println("Prepared using Pasta,onion,tomatos,salt, Oil");
    }
    @Override 
    public void cook(){
        System.out.println("Pasta Cooked in Pan");
    }
    @Override 
    public void serve(){
        System.out.println("Served with Cheese and Coriander Leaves");
    }
}

abstract class PersonRe{
    private  int id;
    private String name;
    private String email;

    PersonRe(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    abstract void displayRole();
    abstract void displayResponsibilities();

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    abstract void dispalyAllInfo();
}

class StudentRe extends PersonRe{
    private int rollNo;
    private double gpa;

    StudentRe(int id,String name,String email,int rollNo,double gpa){
        super(id, name, email);
        this.rollNo=rollNo;
        this.gpa=gpa;
    }
    @Override 
    public void displayRole(){
        System.out.println("Role: Student");
    }
    @Override 
    public void displayResponsibilities(){
        System.out.println("Responsibilities: Attend classes, Submit Assignments");
    }
    @Override 
    public void dispalyAllInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: "+ getEmail());
        System.out.println("Roll No: " + rollNo);
        System.out.println("GPA: " + gpa);
        displayRole();
        displayResponsibilities();
    }
}
class TeacherRe extends PersonRe{
    private String subject;
    private String experinece;

    TeacherRe(int id,String name,String email,String subject,String experience){
        super(id, name, email);
        this.subject=subject;
        this.experinece=experience;
    }
    @Override 
    public void displayRole(){
        System.out.println("Role: Teacher");
    }
    @Override 
    public void displayResponsibilities(){
        System.out.println("Responsibilities: Teach classes, evaluate students");
    }
    @Override 
    public void dispalyAllInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: "+ getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Experinece: " + experinece);
    }
}
class Administrator extends PersonRe{
    private String department;
    private String position;

    Administrator(int id,String name,String email,String department,String position){
        super(id, name, email);
        this.department=department;
        this.position=position;
    }
    @Override 
    public void displayRole(){
        System.out.println("Role: Administrator");
    }
    @Override 
    public void displayResponsibilities(){
        System.out.println("Responsibities: Manage records, schedule classes");
    }
    @Override 
    public void dispalyAllInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: "+ getEmail());
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }
}
public class AbstractRecall {
    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();

        a1.eat();
        a2.eat();
        a1.sound();
        a2.sound();

        System.out.println("---------------");
        int id=101;
        String name="Sujay Kamble";
        int salary=70000;
        EmployeeAB e1=new PermnantEmp(id, name, salary);
        EmployeeAB e2=new ContractEmp(id, name, salary);


        e1.displayDetails();
        System.out.println("=============");
        e2.displayDetails();

        System.out.println("=============");
        String food1="Margrita";
        int price1=350;
        String prepTime1="30 mins";

        Food f1=new Pizza(food1, price1, prepTime1);
        System.out.println("=======Pizza=========");
        f1.displayInfo();
        System.out.println("=============");
        System.out.println("=======Burger=======");
        String food2="Jumbo Burger";
        int price2=199;
        String prepTIme2="15 mins";

        Food f2=new Burger(food2, price2, prepTIme2);
        f2.displayInfo();
        System.out.println("=============");
        System.out.println("=======Pasta=======");
        String food3="Cheese Pasta";
        int price3=180;
        String prepTIme3="20 mins";

        Food f3=new Pasta(food3, price3, prepTIme3);
        f3.displayInfo();
        System.out.println("=============");

        int id1=101;
        String name1="Sujay Kamble";
        String email1="sujay@123.com";

        int id2=102;
        String name2="Raj Mali";
        String email2="pappaphoto@321.com";

        int id3=103;
        String name3="Swaraj Bapu";
        String email3="swaraj@2085bapu.com";

        PersonRe p1=new StudentRe(id1, name1, email1, 70, 7.71);
        PersonRe p2=new TeacherRe(id2, name2, email2, "Java", "10 Years");
        PersonRe p3=new Administrator(id3, name3, email3, "Computer Science", "HOD");

        p1.dispalyAllInfo();
        System.out.println("=============");
        p2.dispalyAllInfo();
        System.out.println("=============");
        p3.dispalyAllInfo();
        System.out.println("=============");
    }
}
