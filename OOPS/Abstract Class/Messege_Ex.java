package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Notifications {
    abstract String send(String msg);
}

class Emails extends Notifications {
    @Override
    public String send(String msg){
        return "Email: " + msg + " SUCCESS";
    }    
}

class TextMsg extends Notifications {
    @Override
    public String send(String msg){
        if (msg==null || msg.length()>10) {
            return "Text Sms: " + msg + " FAILED";
        }

        return "Text Sms: "+ msg + " SUCCESS";
    }    
}

class PushSms extends Notifications {
    @Override
    public String send(String msg){
        if (msg == null || msg.isEmpty()) {
            return "Push: FAILED";
       }

        return "Push: "+ msg + " SUCCESS";
    }    
}
public class Messege_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String msg=sc.nextLine();

        Notifications n[]=new Notifications[3];
        n[0]=new Emails();
        n[1]=new TextMsg();
        n[2]=new PushSms();

        for(int i=0; i<n.length; i++){
            System.out.println(n[i].send(msg));
        }
        sc.close();
    }
}
