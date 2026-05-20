package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Order {
    abstract int calculateBill(int amount);
    abstract String getType();

    public boolean isValid(int amount){
        return amount>0;
    }
}

class NormalOrder extends Order {
    @Override
    public int calculateBill(int amount){
        return amount;
    }    

    @Override
    public String getType(){
        return "Normal Order";
    }
}

class PrimeOrder extends Order {
    @Override
    public int calculateBill(int amount){
        return amount-(amount*10)/100;
    }  
    
    @Override
    public String getType(){
        return "Prime Order";
    }
}

class InternationalOrder extends Order {
    @Override
    public int calculateBill(int amount){
        return amount+(amount*20)/100;
    }   
    
    @Override
    public String getType(){
        return "International Order";
    }
}
public class Order_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int amount=sc.nextInt();

        if (amount<=0) {
            System.out.println("Invalid Amount");
            sc.close();
            return;
        }
        
        Order o[]=new Order[3];
        o[0]=new NormalOrder();
        o[1]=new PrimeOrder();
        o[2]=new InternationalOrder();

        for(int i=0; i<o.length; i++){
            System.out.println(o[i].getType()+":"+o[i].calculateBill(amount));
        }
        sc.close();
    }
}
