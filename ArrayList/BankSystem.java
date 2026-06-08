package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class Customer{
    private String accountNo;
    private String name;
    private int balance;

    Customer(String accountNo, String name, int balance){
        setAccountNo(accountNo);
        setName(name);
        setBalance(balance);
    }

    public void setAccountNo(String accountNo){
        if ((accountNo!=null && !accountNo.isEmpty()) && accountNo.length()==11) {
            this.accountNo=accountNo;
        }else{
            this.accountNo="Invalid";
        }
    }

    public String getAccountNo(){
        return accountNo;
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

    public int deposit(int amount){
        if (amount<=0) {
            throw new ArithmeticException("Invalid Amount");
        }

        balance+=amount;
        return balance;
    }

    public int withdraw(int amount) throws InsufficientBalanceException{
        if (amount<=0) {
            throw new ArithmeticException("Invalid Amount");
        }
        if (amount>balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance-=amount;
        return balance;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Customer> customers=new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add Customer");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Withdraw");
            System.out.println("Enter 4 for View Customer");
            System.out.println("Enter 5 for delete Customer");
            System.out.println("Enter 6 for View Richest Customer");
            System.out.println("Enter 7 for Exit");

            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Accountno:");
                    String accountNo=sc.nextLine();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                   System.out.println("Enter Balance: ");
                   int balance=sc.nextInt();

                   boolean exists = false;

                   for(Customer c: customers){
                   if(c.getAccountNo().equals(accountNo)){
                   exists = true;
                   break;
                   }
                  }

                if(exists){
                System.out.println("Account Already Exists");
                 }else{
                customers.add(new Customer(accountNo, name, balance));
                System.out.println("Account Added");
                 }

                 System.out.println();
                 break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter account no for depositing amount");
                    String account=sc.nextLine();
                    System.out.println("Enter Amount");
                    int depositamt=sc.nextInt();
                    boolean deposit=false;
                    
                    for (Customer c : customers) {
                        if (c.getAccountNo().equals(account)) {
                           c.deposit(depositamt);
                            System.out.println("Depositd: " + "AccountNo: " + c.getAccountNo() + " Name: " + c.getName() + " Balance: " + c.getBalance());
                            deposit=true;
                            break;
                        }
                    }

                    if (!deposit) {
                        System.out.println("Invalid Account No");
                    }
                    System.out.println();
                    break;
            
                case 3:
                    sc.nextLine();
                    System.out.println("Enter account no for withdraw amount");
                    String accountno=sc.nextLine();
                    System.out.println("Enter Amount");
                    int withdrawamt=sc.nextInt();
                    boolean withdraw=false;

                   
                    try {
                        for (Customer c : customers) {
                        if (c.getAccountNo().equals(accountno)) {
                            c.withdraw(withdrawamt);
                            System.out.println("Withdraw: " + "AccountNo: " + c.getAccountNo() + " Name: " + c.getName() + " Balance: " + c.getBalance());
                            withdraw=true;
                            break;
                        }
                    }
                    } catch (ArithmeticException e) {
                       System.out.println(e.getMessage());
                    }catch(InsufficientBalanceException e){
                        System.out.println(e.getMessage());
                    }

                    if (!withdraw) {
                        System.out.println("Invalid Account no");
                    }
                    System.out.println();
                    break;

                case 4:
                    for (Customer c : customers) {
                        System.out.println("AccountNo: " + c.getAccountNo() + " Name: " + c.getName() + " Balance: " + c.getBalance());
                    }
                    System.out.println();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Enter Account no to delete");
                    String deleteNo=sc.nextLine();
                    boolean delete=false;

                    for(int i=0; i<customers.size(); i++){
                        if (customers.get(i).getAccountNo().equals(deleteNo)) {
                            customers.remove(i);
                            delete=true;
                            break;
                        }
                    }

                    if (delete) {
                        System.out.println("Deleted");
                        for (Customer c : customers) {
                        System.out.println("AccountNo: " + c.getAccountNo() + " Name: " + c.getName() + " Balance: " + c.getBalance());
                    }
                    }else{
                        System.out.println("Not Deleted");
                    }
                    System.out.println();
                    break;

                case 6:
                    if (customers.isEmpty()) {
                        System.out.println("No Account Available");
                        break;
                    }

                    Customer richaccount=customers.get(0);

                    for(Customer c: customers){
                        if (c.getBalance() > richaccount.getBalance()) {
                            richaccount=c;
                        }
                    }

                    System.out.println("Richest Account is");
                    System.out.println("AccountNo: " + richaccount.getAccountNo() + " Name: " + richaccount.getName() + " Balance: " + richaccount.getBalance());
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Exited !");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
