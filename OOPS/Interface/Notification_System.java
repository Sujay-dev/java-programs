<<<<<<< HEAD
package OOPS.Interface;

import java.util.Scanner;

interface Notification {
    String send(String msg);
    String getPriority();    
}

class HighPriority implements Notification {
    public String send(String msg){
        return msg.toUpperCase();
    }    
    public String getPriority() {
       return "URGENT";
    }
}

class MidPriority implements Notification {
    public String send(String msg){
       return "[INFO] " + msg;
    }    
    public String getPriority() {
       return "INFO";
    }
}

class LowPriority implements Notification {
    public String send(String msg){
        return msg.toLowerCase();
    }    
    public String getPriority() {
       return "NORMAL";
    }
}
public class Notification_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String msg=sc.nextLine();
        if(msg == null || msg.isEmpty()){
        System.out.println("Invalid message");
        sc.close();
        return;
      }
        Notification n[]=new Notification[3];
        n[0]=new HighPriority();
        n[1]=new MidPriority();
        n[2]=new LowPriority();

        for(int i=0; i<n.length; i++){
            System.out.println(n[i].getPriority() + " : " + n[i].send(msg));
        }
        sc.close();
    }
}
=======
package OOPS.Interface;

import java.util.Scanner;

interface Notification {
    String send(String msg);
    String getPriority();    
}

class HighPriority implements Notification {
    public String send(String msg){
        return msg.toUpperCase();
    }    
    public String getPriority() {
       return "URGENT";
    }
}

class MidPriority implements Notification {
    public String send(String msg){
       return "[INFO] " + msg;
    }    
    public String getPriority() {
       return "INFO";
    }
}

class LowPriority implements Notification {
    public String send(String msg){
        return msg.toLowerCase();
    }    
    public String getPriority() {
       return "NORMAL";
    }
}
public class Notification_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String msg=sc.nextLine();
        if(msg == null || msg.isEmpty()){
        System.out.println("Invalid message");
        sc.close();
        return;
      }
        Notification n[]=new Notification[3];
        n[0]=new HighPriority();
        n[1]=new MidPriority();
        n[2]=new LowPriority();

        for(int i=0; i<n.length; i++){
            System.out.println(n[i].getPriority() + " : " + n[i].send(msg));
        }
        sc.close();
    }
}
>>>>>>> a86436e2a880c3a8aa8349cb1b244a86f0bf53b3
