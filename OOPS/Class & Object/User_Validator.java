package OOPS.Class_Object;

import java.util.Scanner;

class User {
    private String username;

    User(){
        this("Unknown");
    }

    User(String username){
        setName(username);
    }

    public void setName(String uname){
        if (uname!=null && !uname.isEmpty()) {
            this.username=uname;
        }else{
            this.username="Unknown";
        }
    }

    public boolean isvalid(){
        if (username.length()<5) {
            return false;
        }
        for(int i=0; i<username.length(); i++){
            if (username.charAt(i)==' ') {
                return false;
            }
        }
        return true;
    }

    public String toUpper(){
    return username.toUpperCase();
    }

    public void display(){
    System.out.println("Username : " + username);
    System.out.println("Valid : " + isvalid());
    System.out.println("Uppercase : " + toUpper());
}
}
public class User_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username=sc.next();

        User u1=new User();
        u1.display();

        User u2=new User(username);
        if (u2.isvalid()) {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        System.out.println(u2.toUpper());
        u2.display();
        sc.close();
    }
}
