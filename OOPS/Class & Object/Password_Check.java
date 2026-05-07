package OOPS.Class_Object;

import java.util.Scanner;

class Check {
    private String password;

    Check(){
        this("Invalid");
    }

    Check(String password){
        setPassword(password);
    }

    public void setPassword(String password){
        if (password!=null && !password.isEmpty()) {
            this.password=password;
        }else{
            this.password=null;
        }
    }

    public boolean isstrong(){
        if (password.length()<8) {
            return false;
        }

        boolean digit=false;
        boolean upper=false;
        for(int i=0; i<password.length(); i++){
            char ch=password.charAt(i);

            if (ch>='1' && ch<='9') {
                digit=true;
            }

            if (ch>='A' && ch<='Z') {
                upper=true;
            }
        }
        return digit&&upper;
    }

   public String mask(){

    StringBuilder masked = new StringBuilder();

    for(int i = 0; i < password.length(); i++){
        masked.append("*");
    }

    return masked.toString();
    }

    public void display(){
        System.out.println("Passwrod : "+password);
        System.out.println("Strong : "+isstrong());
        System.out.println("Mask : "+mask());
    }
}

public class Password_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String password=sc.nextLine();

        Check c1=new Check();
        c1.display();

        Check c2=new Check(password);
        if (c2.isstrong()) {
            System.out.println("Strong ");
        }else{
            System.out.println("Not strong ");
        }
        System.out.println(c2.mask());
        c2.display();
        sc.close();
    }
}
