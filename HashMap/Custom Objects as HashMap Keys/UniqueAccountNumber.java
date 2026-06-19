package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Account{
    private String accNumber;       
    private String name;
    private double balance;

   Account(String accNumber,String name, double balance){
    this.accNumber=accNumber;
    this.name=name;
    this.balance=balance;
   }

    public String getAccountNumber(){
        return accNumber;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Account)) return false;
        Account other=(Account) obj;
        return this.accNumber.equals(other.accNumber);
    }

    @Override
    public int hashCode(){
        return this.accNumber.hashCode();
    }
}
public class UniqueAccountNumber {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Account,String> map=new HashMap<>();

        Account a1=new Account("1290873474798", "Sujay", 50000);
        Account a2=new Account("1290873474798", "Sujay Kamble", 5000);

        map.put(a1, "Invester Account");
        map.put(a2, "Savings Account");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getAccountNumber() + " -> " + s.getValue());
        }

        System.out.println(map.size());
        sc.close();
    }
}
