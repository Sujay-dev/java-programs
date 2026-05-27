import java.util.Scanner;

class Account{
    private String username;
    private String password;
    private int balance;
    private String lastTransaction="NO Transactions yet";

    Account(String username, String password, int balance){
        setValues(username, password);
        setBalance(balance);
    }

    public void setValues(String username, String password){
        if ((username!=null && !username.isEmpty()) && (password!=null && !password.isEmpty())) {
            this.username=username;
            this.password=password;
        }
    }

    public boolean login(String username, String password){
        return username.equals("User") && password.equals("User@123");
    }

    public void setBalance(int balance){
        if (balance>=0) {
            this.balance=balance;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount>0) {
            balance+=amount;
            lastTransaction="Deposited: " + amount;
        }else{
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(int amount){
        if (amount<=balance) {
            balance-=amount;
            lastTransaction="Withdraw: "+ amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public String getLastTransaction(){
        return lastTransaction;
    }
    public String mask(){
        StringBuilder masked=new StringBuilder();
        masked.append(password);
        return masked.toString();
    }
}
public class Banking_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String username=sc.nextLine();
        String password=sc.nextLine();

        String u=sc.nextLine();
        String p=sc.nextLine();

         Account acc=new Account(username, password, 0);
        if (!acc.login(u, p)) {
            System.out.println("Login Failed");
        }

        System.out.println("Login Success");
       

        while (true) {
             System.out.println("1. Check Balance");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
             System.out.println("4. Last Transaction");
             System.out.println("5. Exit");

             int choice=sc.nextInt();

             switch (choice) {
                case 1:
                    System.out.println("Balance: " + acc.getBalance());
                    break;
             
                case 2:
                    int d=sc.nextInt();
                   acc.deposit(d);
                   break;

                case 3:
                    int w=sc.nextInt();
                    acc.withdraw(w);
                    break;
                case 4:
                    System.out.println("Last Trasaction: "+ (acc.getLastTransaction()));
                    break;

                case 5:
                    System.out.println("Exited");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
             }
        }
       
    }
}
