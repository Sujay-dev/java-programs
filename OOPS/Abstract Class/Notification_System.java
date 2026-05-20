package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Notification {
    abstract String send(String message);
}

class Email extends Notification {
    @Override
    public String send(String message){
         if(message.length() > 50){
           return "Email failed: message too long";
         }
        return "Email: "+message+" sent";
    }    
}

class Sms extends Notification {
    @Override
    public String send(String message){
        if (message.length()>10) {
            return "Sms failed: message too long";
        }
        return "SMS: "+ message + " sent";
    }    
}

class Push extends Notification {
    @Override
    public String send(String message){
        if(message.trim().isEmpty()){
            return "Push failed: empty message";
        }
        return "Push: "+ message +" sent instantly";
    }    
}
public class Notification_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String message=sc.nextLine();

        Notification n[]=new Notification[3];
        n[0]=new Email();
        n[1]=new Sms();
        n[2]=new Push();

        for(int i=0; i<n.length; i++){
            System.out.println(n[i].send(message));
        }
        sc.close();
    }
}
