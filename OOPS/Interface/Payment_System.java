package OOPS.Interface;

import java.util.Scanner;

interface Payment {
    int pay(int amount);
    String getType();
}

class Upi implements Payment {
    public String getType(){
        return "UPI";
    }
    public int pay(int amount){
        if (amount<=0) {
            return 0;
        }
        return amount;
    }    
}

class Card implements Payment {
     public String getType(){
        return "Card";
    }
    public int pay(int amount){
        if (amount<=0) {
            return 0;
        }
        return  (amount + (amount*2)/100);
    }    
}

class NetBanking implements Payment {
     public String getType(){
        return "NetBanking";
    }
    public int pay(int amount){
        if (amount<=0) {
            return 0;
        }
        return (amount + (amount*1)/100);
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
            System.out.println(p[i].getType() + " : " + p[i].pay(amount));
        }
        sc.close();
    }
}
