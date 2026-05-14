package OOPS.Inheritance;

import java.util.Scanner;

class BankAccount {
    private String accholder;
    private int balance;

    BankAccount(String accholder, int balance){
        setAccholder(accholder);
        setBalance(balance);
    }

    public void setAccholder(String accholder){
        if (accholder!=null && !accholder.isEmpty()) {
            this.accholder=accholder;
        }else{
            this.accholder="Unknown";
        }
    }

    public String getAccholder(){
        return accholder;
    }

    public void setBalance(int balance){
        if (balance>=0) {
            this.balance=balance;
        }else{
            this.balance=0;
        }
    }

    public int getBalance(){
        return balance;
    }
    
    public void deposit(int amount){
        if (amount<=0) {
            System.out.println("Invalid amount");
            return;
        }
        balance+=amount;

       //OR u can use this : setBalance(getBalance() + amount);
    }

    public void withdraw(int amount){

    if(amount <= 0){
        System.out.println("Invalid Amount");
        return;
    }

    if(amount > getBalance()){
        System.out.println("Insufficient Balance");
        return;
    }

    balance -= amount;
}

    public void displayAccount(){
        System.out.println("Account Holder : "+getAccholder());
        System.out.println("Balance : "+getBalance());
    }
}

class SavingsAccount extends BankAccount{
    private int interestrate;
    private int time;

    SavingsAccount(String name,int balance,int rate,int time){
        super(name,balance);
        setInterestrate(rate);
        setTime(time);
    }

    public void setInterestrate(int rate){
        if (rate>0) {
            this.interestrate=rate;
        }else{
            this.interestrate=0;
        }
    }

    public int getInterestrate(){
        return interestrate;
    }

    public void setTime(int time){
        if (time>0) {
            this.time=time;
        }else{
            this.time=0;
        }
    }

    public int getTime(){
        return time;
    }

    public int calculate(){
        return (getBalance()*interestrate*time)/100;
    }

    public void displaySavings(){
        displayAccount();
        System.out.println("Interest Rate : "+getInterestrate());
        System.out.println("Time  : "+ getTime());
        System.out.println("Savings : "+calculate());
    }
}
public class Bankacc_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name=sc.nextLine();
        int balance=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();

        SavingsAccount sa=new SavingsAccount(name, balance, rate, time);
        sa.deposit(100);
        sa.withdraw(200);
        sa.displaySavings();
        sc.close();
    }
}
