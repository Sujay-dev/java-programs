package OOPS.Inheritance;

import java.util.Scanner;

class Notification {
    public void send(){
        System.out.println("Sent Successfully! ");
    }    
}

class Email extends Notification{
    private String emailId;
    private String subject;
    
    Email(String emailId,String subject){
        setEmail(emailId);
        setSubject(subject);
    }

    public void setEmail(String emailId){
        if (emailId!=null && emailId.contains("@") && emailId.contains(".")) {
            this.emailId=emailId;
        }else{
            this.emailId="Invalid";
            }
        }
    

    public void setSubject(String subject){
        if (subject!=null && !subject.isEmpty()) {
            this.subject=subject;
        }else{
            this.subject="Invalid";
        }
    }

    @Override
    public void send(){
        System.out.println("Sending Email to : {"+emailId+"}");
        System.out.println("Subject : "+subject);
        super.send();
    }
}

class Sms extends Notification{
    private String phoneNumber;
    private String meassage;
    
    Sms(String phonenumber,String meassage){
        setNumber(phonenumber);
        setMsg(meassage);
    }

    public void setNumber(String number){
        if (number.length()==10) {
            this.phoneNumber=number;
        }else{
            this.phoneNumber="Invalid";
        }
    }

    public void setMsg(String msg){
        if (msg!=null && !msg.isEmpty()) {
            this.meassage=msg;
        }else{
            this.meassage="Invalid";
        }
    }

    @Override
    public void send(){
        System.out.println("Sending meassage to : {"+phoneNumber+"}");
        System.out.println("Meassage : "+meassage);
        super.send();
    }
}
public class Notification_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String emailId=sc.nextLine();
        String subject=sc.nextLine();
        String phoneNumber=sc.nextLine();
        String meassage=sc.nextLine();

        Email email=new Email(emailId, subject);
        email.send();

        Sms sms=new Sms(phoneNumber, meassage);
        sms.send();
        sc.close();
    }
}
