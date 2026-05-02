package OOPS;

import java.util.Scanner;

class Password_Checker {
   private String password;

   Password_Checker(String password){
    setpassword(password);
   }
   
   public void setpassword(String password){
    if (password==null) 
        password="";
    else
    this.password=password;
   }

    public boolean isvalid(){

        if (password.length()<8) return false;

        boolean digit=false;
        boolean upper=false;
         for(int i=0; i<password.length(); i++){
            char ch=password.charAt(i);

            if(ch>='0' && ch<='9'){
                digit=true;;
            }
            if (ch>='A' && ch<='Z') {
                upper=true;
            }
         }
         return digit&&upper;
    }
}

public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String password=sc.next();
        Password_Checker p1=new Password_Checker(password);
        if (p1.isvalid()) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid password");
        }
        sc.close();
    }
}
