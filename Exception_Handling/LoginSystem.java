package Exeption_Handling;

import java.util.Scanner;

class Login{
    private String username;
    private String password;

    Login(String username, String password){
        setnamepass(username, password);
    }

    public void setnamepass(String username, String password){
        if ((username!=null && !username.isEmpty()) && (password!=null && !password.isEmpty())) {
            this.username=username;
            this.password=password;
        }else{
            this.username="Unknown";
            this.password="Invalid";
        }
    }

    public boolean login(String username, String password){
        if (!username.equals("Admin") || !password.equals("Admin@123")) {
            throw new RuntimeException("Invalid Credentials");
        }
        
        return true;
    }
}
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String username=sc.nextLine();
        String password=sc.nextLine();

        Login l=new Login(username, password);

        try {
            System.out.println("Login Success: " + l.login(username, password));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
