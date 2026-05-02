package OOPS;

import java.util.Scanner;

class Account {
    private String accountholder;
    private int money;

    Account(String accountholder, int money){
        setname(accountholder);
        setMoney(money);
    }

    public void setname(String accountholder){
        this.accountholder=accountholder;
    }

    public void setMoney(int money){
        if (money>0) {
            this.money=money;
        }else{
            this.money=0;
        }
    }

   public void deposit(int amount){
        if(amount <= 0){
        System.out.println("Invalid amount");
        return;
       }
        money+=amount;
    }

    public void withdraw(int amount){
        if (amount<=0) {
            System.out.println("Amount must be positive");
            return;
        }
        if (money>=amount) {
            money-=amount;
        }
        else{
            System.out.println("Insufficient Balance ");
        }
    }

   public void trasfer(Account other_acc, int amount){
        if (amount<=0) {
            System.out.println("Invalid Amount");
            return;
        }
        if (money>=amount) {
        money-=amount;
        other_acc.deposit(amount);
        }else{
            System.out.println("Insufficient balance ");
        }
    }

       public void display(){
            System.out.println("Name : "+accountholder + " , "+ "Balance : "+ money);

        }
    }
public class Bankex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter account holder name : ");
        String name=sc.nextLine();
        System.out.println("Enter Balance : ");
        int balanace=sc.nextInt();
        Account a1=new Account(name,balanace);
        sc.nextLine();

        System.out.println("Enter other account holder name : ");
        String name2=sc.nextLine();
        System.out.println("Enter their balance : ");
        int balance2=sc.nextInt();
        Account a2=new Account(name2,balance2);

        a1.deposit(100);
        a1.withdraw(300);
        a1.trasfer(a2, 100);
        a1.display();
        a2.display();
        sc.close();
    }
}
