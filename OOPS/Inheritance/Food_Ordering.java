package OOPS.Inheritance;

import java.util.Scanner;

class Food {
    private String name;
    private int price;
    
    Food(String name, int price){
        setName(name);
        setPrice(price);
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

    public void setPrice(int price){
        if (price>0) {
            this.price=price;
        }else{
            this.price=0;
        }
    }

    public int getPrice(){
        return price;
    }

    public void prepare(){
        System.out.println("Preparing food ");
    }

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Price : "+getPrice());
    }
}

class Pizza extends Food{
    private String size;
    
    Pizza(String name, int price, String size){
        super(name, price);
        setSize(size);
    }
    public void setSize(String size){
        if (size.equals("Small") || size.equals("Large") || size.equals("Medium")) {
            this.size=size;
        }else{
            this.size="Unknown";
        }
    }

    @Override
    public void prepare(){
        super.prepare();
        System.out.println("Preparing pizza "+size+" size");
    }
}

class Burger extends Food{
    private boolean extraCheese;

    Burger(String name, int price, boolean extraCheese){
        super(name, price);
        setExtracheese(extraCheese);
    }

    public void setExtracheese(boolean extracheese){
        this.extraCheese=extracheese;
    }

    @Override
    public void prepare(){
        super.prepare();
        if (extraCheese) {
            System.out.println("Preapring burger with extra cheese ");
        }else{
            System.out.println("Preparing burger without extra cheese ");
        }
    }
}
public class Food_Ordering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int price=sc.nextInt();
        String size=sc.next();
        boolean extracheese=sc.nextBoolean();

        Pizza pizza=new Pizza(name, price, size);
        pizza.prepare();
        pizza.display();

        System.out.println();
        
        Burger burger=new Burger(name, price, extracheese);
        burger.prepare();
        burger.display();
        sc.close();
    }
}
