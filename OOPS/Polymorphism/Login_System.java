package OOPS.Polymorphism;

import java.util.Scanner;

class Login {
    public void authenticate(){
    }    
}

class EmailLogin extends Login {
    @Override
    public void authenticate(){
      System.out.println("Login with email ");    
    }    
}

class GoogleLogin extends Login {
    @Override
    public void authenticate(){
        System.out.println("Login with google ");
    }
}

class PhoneLogin extends Login {
    @Override
    public void authenticate(){
        System.out.println("Login with phone ");
    }    
}
public class Login_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Login l[]=new Login[3];
        l[0]=new EmailLogin();
        l[1]=new GoogleLogin();
        l[2]=new PhoneLogin();

        for(int i=0; i<l.length; i++){
            l[i].authenticate();
        }
        sc.close();
    }
}
