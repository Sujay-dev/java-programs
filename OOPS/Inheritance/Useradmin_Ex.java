package OOPS.Inheritance;

import java.util.Scanner;

class User {
    private String username;
    private String password;

    User(String username,String password){
        setUsername(username);
        setPassword(password);
    }

    public void setUsername(String username){
        if (username!=null && !username.isEmpty()) {
            this.username=username;
        }else{
            this.username="Unknown";
        }
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        if (password!=null && !password.isEmpty()) {
            this.password=password;
        }else{
            this.password="Invalid";
        }
    }

    public boolean isvalid(){
        if (password.length()<8) {
            return false;
        }
        boolean digit=false;
        boolean upper=false;

        for(int i=0; i<password.length(); i++){
            char ch=password.charAt(i);

            if (ch>='0' && ch<='9') {
                digit=true;
            }
            if (ch>='A' && ch<='Z') {
                upper=true;
            }
        }
        return digit && upper;
    }

    public String maskpassword(){
        StringBuilder mask=new StringBuilder();
        for(int i=0; i<password.length(); i++){
            mask.append("*");
        }
        return mask.toString();
    }

    public void display(){
        System.out.println("Username : "+getUsername());
        System.out.println("Password : "+maskpassword());
        System.out.println("Valid password : "+isvalid());
    }
}

class Admin extends User{
    private String role;
    
    Admin(String username, String password,String role){
        super(username, password);
        setRole(role);
    }

    public void setRole(String role){
        if (role!=null && !role.isEmpty()) {
            this.role=role;
        }else{
            this.role="Unknown";
        }
    }

    public String getRole(){
        return role;
    }
    public void displayAdmin(){
        display();
        System.out.println("Role : "+getRole());
    }
}

public class Useradmin_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String username=sc.nextLine();
        String password=sc.nextLine();
        String role=sc.nextLine();

        Admin admin= new Admin(username, password, role);
        admin.displayAdmin();
        sc.close();
    }
}
