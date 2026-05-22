package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Passwordchecker {
    abstract String check(String password);
    abstract String getType(); 
}

class Weak extends Passwordchecker {
    @Override
    public String getType(){
        return "Weak";
    }    
    @Override
    public String check(String password){
        if (password.length()<6) {
            return "Weak";
        }
        if (password.length()>6 && password.length()<10) {
            return "Medium";
        }
        return "Strong";
    }
}

class Medium extends Passwordchecker {
     @Override
    public String getType(){
        return "Medium";
    }    
    @Override
    public String check(String password){
        if (password.length()<6) {
            return "Weak";
        }
        if (password.length()>6 && password.length()<10) {
            return "Medium";
        }
        return "Strong";
    }    
}

class Strong extends Passwordchecker {
     @Override
    public String getType(){
        return "Strong";
    }    
    @Override
    public String check(String password){
        if (password.length()<6) {
            return "Weak";
        }
        if (password.length()>6 && password.length()<10) {
            return "Medium";
        }
        return "Strong";
    }    
}
public class Password_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String password=sc.next();

        Passwordchecker p[]=new Passwordchecker[3];
        p[0]=new Weak();
        p[1]=new Medium();
        p[2]=new Strong();

        for(int i=0; i<p.length; i++){
            System.out.println(p[i].getType() + " " + p[i].check(password));
        }
        sc.close();
    }
}
