package OOPS.Polymorphism;

import java.util.Scanner;

class BankAccount {
    private String name;
    private int balance;
    
    BankAccount(String name, int balance){
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

    public String getName(){
        return name;
    }

    public void setBalance(int balance){
        if (balance>0) {
            this.balance=balance;
        }else{
            this.balance=0;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Balance : "+getBalance());
    }
    public void calculateInterest(){
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String name,int balance){
        super(name, balance);
    }

    @Override
    public void calculateInterest(){
        super.display();
        int interest=getBalance()*4/100;
        System.out.println("Interest in Savings Account : "+interest);
    }    
}

class FixedDeposit extends BankAccount {
    
    FixedDeposit(String name,int balance){
        super(name, balance);
    }

    @Override
    public void calculateInterest(){
        super.display();
        int interest=getBalance()*8/100;
        System.out.println("Interest on fixed deposit : "+interest);
    }
}

class CurrentAccount extends BankAccount {
    
    CurrentAccount(String name,int balance){
        super(name, balance);
    }

    @Override
    public void calculateInterest(){
        super.display();
        int interest=getBalance()*2/100;
        System.out.println("Interest on current account balance : "+interest);
    }
}
public class Bank_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int balance=sc.nextInt();

        BankAccount b[]=new BankAccount[3];
        b[0]=new SavingsAccount(name, balance);
        b[1]=new FixedDeposit(name, balance);
        b[2]=new CurrentAccount(name, balance);

        for(int i=0; i<b.length; i++){
            b[i].calculateInterest();
            System.out.println();
        }
        sc.close();
    }
}
