package OOPS.Class_Object;

import java.util.Scanner;

class Email {
    private String email;

    Email(){
        this("Unknown");
    }

    Email(String email){
        setEmail(email);
    }

    public void setEmail(String email){
        if (email!=null && !email.isEmpty()) {
            this.email=email;
        }else{
            this.email="Invalid email";
        }
    }

   public String getUsername(){
    int index = email.indexOf('@');

    if(index == -1){
        return "Invalid";
    }

    return email.substring(0, index);
}

   public String getDomain(){
    int index = email.indexOf('@');

    if(index == -1){
        return "Invalid";
    }

    return email.substring(index + 1);
}

    public boolean isvalid(){
    return email.contains("@") && email.contains(".");
}

    public void display(){
        System.out.println("Email ID : "+ email);
        System.out.println("Only Username : "+getUsername());
        System.out.println("Only Domain : "+getDomain());
        System.out.println("Valid : "+isvalid());
    }
}
public class Email_Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email=sc.nextLine();

        Email e1=new Email();
        e1.display();

        Email e2=new Email(email);
        System.out.println(e2.getUsername());
        System.out.println(e2.getDomain());
        if (e2.isvalid()) {
            System.out.println("Valid Email ID");
        }else{
            System.out.println("Invalid Email ID");
        }
        e2.display();
        sc.close();
    }
}
