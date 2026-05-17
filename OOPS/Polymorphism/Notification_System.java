package OOPS.Polymorphism;

import java.util.Scanner;

class Alert {
    public void sendAlert(String meassage){}    
}

class Email extends Alert {
    private String emailId;
    
    Email(String email){
        setEmail(email);
    }
    public void setEmail(String email){
        if (email!=null && !email.isEmpty()) {
            this.emailId=email;
        }else{
            this.emailId="Invalid";
        }
    }

    @Override
    public void sendAlert(String meassage){
        System.out.println("Email : "+emailId);
        System.out.println("Meassage : "+ meassage);
    }
}

class Sms extends Alert {
    private String phone;
    
    Sms(String phone){
        setSms(phone);
    }
    public void setSms(String phone){
        if (phone!=null && !phone.isEmpty() && phone.length()==10) {
            this.phone=phone;
        }else{
            this.phone="Invalid";
        }
    }

    @Override
    public void sendAlert(String meassage){
        System.out.println("Phone : "+phone);
        System.out.println("Sms : "+ meassage);
    }
}

class App extends Alert {
    private String app;
    
    App(String app){
        setAppname(app);
    }

    public void setAppname(String app){
        if (app!=null && !app.isEmpty()) {
            this.app=app;
        }else{
            this.app="Invalid";
        }
    }

    @Override
    public void sendAlert(String meassage){
        System.out.println("App : "+app);
        System.out.println("Meassage : "+meassage);

    }
}
public class Notification_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String email=sc.nextLine();
        String phone=sc.nextLine();
        String app=sc.nextLine();
        String meassage=sc.nextLine();

        Alert a[]=new Alert[3];
        a[0]=new Email(email);
        a[1]=new Sms(phone);
        a[2]=new App(app);

        for(int i=0; i<a.length; i++){
            a[i].sendAlert(meassage);
            System.out.println();
        }
        sc.close();
    }
}
