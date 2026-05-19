package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Payment {
    abstract int pay(int amount); 
    abstract String getName();   
}

class Upi extends Payment {

    @Override
    public int pay(int amount){
        return amount;
    }    

    @Override
    public String getName(){
        return "UPI";
    }
}

class Card extends Payment {
    @Override
    public int pay(int amount){
        return amount+(amount*2/100);
    }    

    @Override 
    public String getName(){
        return "Card";
    }
}

class NetBanking extends Payment {
    @Override
    public int pay(int amount){
        return amount+(amount*1/100);
    }    

    @Override
    public String getName(){
        return "NetBanking";
    }
}
public class Payment_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int amount=sc.nextInt();

        Payment p[]=new Payment[3];
        p[0]=new Upi();
        p[1]=new Card();
        p[2]=new NetBanking();

        for(int i=0; i<p.length; i++){
            System.out.println(p[i].getName()+":"+p[i].pay(amount));
        }
        sc.close();
    }
}
