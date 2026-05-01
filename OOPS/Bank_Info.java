package OOPS;

import java.util.Scanner;

class Bank {
     private String name;
     private int balance;

     Bank(String name, int balance){
        this.name=name;
        this.balance=balance;
     }

    public void deposit(int amount){
        if (amount<=0) {
            System.out.println("Invalid amount");
        }else{
        balance+=amount;
    }
}
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }else if (amount<=balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public int getbalance(){
        return balance;
    }
    public void diplay(){
        System.out.println("Name : "+ name);
        System.out.println("Balance : "+ balance);
    }
}
public class Bank_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        System.out.println("Enter Balance : ");
        int balance=sc.nextInt();

        Bank b1=new Bank(name,balance);
        System.out.println("Enter Deposited amount : ");
        int depo=sc.nextInt();
        b1.deposit(depo);
        System.out.println("Balance after depositing amount : ");
        System.out.println(b1.getbalance());
        sc.nextLine();
        System.out.println("Enter Withdraw amount : ");
        int withdra=sc.nextInt();
        b1.withdraw(withdra);
        System.out.println("Balance after withdrawl : ");
        System.out.println(b1.getbalance());
        System.out.println("Final balance : ");
        b1.diplay();
        sc.close();

    }
}
