package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class  Login {
    abstract String login(String input);
    abstract String getType();
}

class EmailLogin extends Login {
    @Override
    public String getType(){
        return "Email Login";
    }    

    @Override
    public String login(String input){
        if (input.contains("@")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}

class PhoneLogin extends Login {
    @Override
    public String getType(){
        return "Phone Login";
    }    

    @Override
    public String login(String input){
        if (input.length()==10 && input.matches("\\d+")) {
            return "SUCCESS";
        }

        return "FAILED";
    }
}

class AdminLogin extends Login {
    @Override
    public String getType(){
        return "Admin Login";
    }    

    @Override
    public String login(String input){
        if (input.equals("admin123")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}
public class Login_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input=sc.next();

        Login l[]=new Login[3];
        l[0]=new EmailLogin();
        l[1]=new PhoneLogin();
        l[2]=new AdminLogin();

        for(int i=0; i<l.length; i++){
            System.out.println(l[i].getType() + " " + l[i].login(input));
        }
        sc.close();
    }
}
