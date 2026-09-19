package Revision_2;

interface Payment{
    void pay(double amount);
    default void receipt(){
        System.out.println("Payment Recipt Generated");
    }
    static void paymentInfo(){
        System.out.println("Payment Processed succesfully !");
    }
}
class UpiIF implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("UPI Payment: " + amount);
    }
    @Override 
    public void receipt(){
        System.out.println("UPI Payment Reciept Generated");
    }
}
class CreditCardre implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Credit Card Payment: " + amount);
    }
}
class CashRe implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Cash Payment: " + amount);
    }
}
interface Printlable{
    void print();
}
interface Scannable{
    void scan();
}
class Printer implements Printlable,Scannable{
    @Override 
    public void print(){
        System.out.println("Printing Document");
    }
    @Override 
    public void scan(){
        System.out.println("Scanning Document");
    }
}
interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    private int r;
    Circle(int r){
        this.r=r;
    }
    @Override 
    public double calculateArea(){
        return 3.14*(r*r);
    }
}
class Rectangle implements Shape{
    private int l;
    private int w;
    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    @Override 
    public double calculateArea(){
        return (double)l*w;
    }
}
class Square implements Shape{
    private  int s;
    Square(int s){
        this.s=s;
    }
    @Override 
    public double calculateArea(){
        return (double)s*s;
    }
}
interface Emp{
    double calculateSalry();
    void displayDetails();
}
class FullTimeEmp implements Emp{
    private  int id;
    private String name;
    private String empType;
    private  int salary;
    FullTimeEmp(int id,String name,String empType,int salary){
        this.id=id;
        this.name=name;
        this.empType=empType;
        this.salary=salary;
    }
    @Override 
    public double calculateSalry(){
        return salary;
    }
    @Override 
    public void displayDetails(){
        System.out.println("ID: "+ id);
        System.out.println("Name: " + name);
        System.out.println("Employee Type: " + empType);
        System.out.println("Salary: " + calculateSalry());
    }
}
class PartTimeEmp implements Emp{
    private  int id;
    private String name;
    private String empType;
    private int hoursWorked;
    private int hourRate;
    
    PartTimeEmp(int id,String name,String empType,int hoursWorked,int hourRate){
        this.name=name;
        this.id=id;
        this.empType=empType;
        this.hoursWorked=hoursWorked;
        this.hourRate=hourRate;
    }
    @Override 
    public double calculateSalry(){
        return hoursWorked*hourRate;
    }
    @Override 
    public void displayDetails(){
        System.out.println("ID: "+ id);
        System.out.println("Name: " + name);
        System.out.println("Employee Type: " + empType);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hours Rate: " + hourRate);
        System.out.println("Salary: " + calculateSalry());
    }
}
interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    private String brand;
    SmartPhone(String brand){
        this.brand=brand;
    }
    @Override 
    public void takePhoto(){
        System.out.println("Taking Photo from " + brand + " Phone");
    }
    @Override 
    public void playMusic(){
        System.out.println("Playing music in "+ brand + " Phone");
    }
}
public class InterFRecall {
    public static void main(String[] args) {
        Payment p1=new UpiIF();
        Payment p2=new CreditCardre();
        Payment p3=new CashRe();

        System.out.println("**********************");
        p1.pay(500);
        p1.receipt();
        Payment.paymentInfo();
        System.out.println("----------");
        p2.pay(1000);
        p2.receipt();
        Payment.paymentInfo();
        System.out.println("----------");
        p3.pay(1500);
        p3.receipt();
        Payment.paymentInfo();

        System.out.println("==================");
        Printer a=new Printer();
        a.print();
        a.scan();
        System.out.println("==================");
        Shape[] s={new Circle(5),new Rectangle(4, 5),new Square(6)};

        for(int i=0; i<s.length; i++){
            System.out.println("Area: " + s[i].calculateArea());
        }
        System.out.println("==================");
        Emp e[]=new Emp[2];
        
        e[0]=new FullTimeEmp(101, "Sujay Kamble", "Full Time", 50000);
        e[1]=new PartTimeEmp(102, "Raj Mali", "Part Time", 2,550);

        for(int i=0; i<e.length; i++){
            e[i].displayDetails();
            System.out.println("-------------");
        }

        System.out.println("==================");
        SmartPhone phone=new SmartPhone("Samsung");
        Camera c=phone;
        MusicPlayer m=phone;

        c.takePhoto();
        System.out.println("--------");
        m.playMusic();
        System.out.println("**********************");
    }
}
