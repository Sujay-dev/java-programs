package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Payments {
    abstract String processPayment(int amount);
} 

class UpiPay extends Payments {
    @Override
    public String processPayment(int amount){
        return "UPi: "+ amount + " Paid succesfully";
    }
}

class Credit extends Payments{
    @Override
    public String processPayment(int amount){
        int charge=amount+(amount*2)/100;
        return "Credit Card:  "+ charge + " Paid succesfully with charges";
    }  
}

class Wallet extends Payments{
     @Override
    public String processPayment(int amount){
    if(amount > 1000){
        int cashback = (amount * 5) / 100;
        int finalAmt = amount - cashback;
        return "Wallet : " + finalAmt + " Cashback applied";
    }
    return "Wallet : " + amount + " No cashback";
} 
}
public class Payment_Gateway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int amount=sc.nextInt();
        Payments p[]=new Payments[3];
        p[0]=new UpiPay();
        p[1]=new Credit();
        p[2]=new Wallet();

        for(int i=0; i<p.length; i++){
            System.out.println(p[i].processPayment(amount));
        }
        sc.close();
    }
}
