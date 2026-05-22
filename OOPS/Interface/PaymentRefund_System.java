package OOPS.Interface;

import java.util.Scanner;

interface Payments{    
    int pay(int amount);
    public static void display(){
        System.out.println("This is payment refund system interface example");
    }
    public default void processPayment(){
        System.out.println("Payment done!");
    }
}

interface Refund {    
    int refund(int amount);
}

class OnlineTransaction implements Payments,Refund {
    public int pay(int amount){
        Payments.display();
        return (amount + (amount*2)/100);
    }   
    
    public int refund(int amount){
        Payments.display();
        int refund=(amount*5)/100;
        int deduction=amount - refund;
        return deduction;
    }
}
public class PaymentRefund_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int amount=sc.nextInt();

        OnlineTransaction o=new OnlineTransaction();

        System.out.println("Paid: " + o.pay(amount));
        System.out.println("Refund: " + o.refund(amount));
        Payments.display();
        o.processPayment();
        sc.close();
    }
}
