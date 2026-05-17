package OOPS.Polymorphism;

import java.util.Scanner;

class Payment_Ex {
    public void pay(){
        System.out.println("Payment done!");
    }    
}

class Upi extends Payment_Ex {
    @Override
    public void pay(){
        super.pay();
        System.out.println("Paid with UPI");
    }
}

class Card extends Payment_Ex {
    @Override
    public void pay(){
        super.pay();
        System.out.println("Paid with Card");
    }   
}

class Cash extends Payment_Ex {
    @Override 
    public void pay(){
        super.pay();
        System.out.println("Paid with Cash");
    }    
}
public class Payment_Example {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         Payment_Ex p1;
         p1=new Upi();
         p1.pay();

         System.out.println();

         p1=new Card();
         p1.pay();

         System.out.println();

         p1=new Cash();
         p1.pay();

         sc.close();
    }
}
