package OOPS.Inheritance;

import java.util.Scanner;

class Acc {
    private String name;
    private int balance;
    
    Acc(String name, int balance){
        setName(name);
        setBalance(balance);
    }
    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public void setBalance(int balance){
        if(balance>0){
            this.balance=balance;
        }else{
            this.balance=0;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void showBalance(){
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }
}

class Savingacc extends Acc{
    private int interestrate;
    private int time;

    Savingacc(String name,int balance,int rate, int time){
        super(name, balance);
        setRate(rate);
        setTime(time);
    }
    public void setRate(int rate){
        if (rate>0) {
            this.interestrate=rate;
        }else{
            this.interestrate=0;
        }
    }

    public void setTime(int time){
        if (time>0) {
            this.time=time;
        }else{
            this.time=0;
        }
    }

    public int calculaterate(){
        return getBalance()*interestrate*time/100;
    }

    public int finalamt(){
        return getBalance()+calculaterate();
    }
    @Override
    public void showBalance(){
        super.showBalance();
        System.out.println("Interest : "+ calculaterate());
        System.out.println("Final balance : "+finalamt());
    }

}
public class Bank_Rate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int balance=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();

        Savingacc savingacc=new Savingacc(name, balance, rate, time);
        savingacc.showBalance();
        sc.close();
    }
}
