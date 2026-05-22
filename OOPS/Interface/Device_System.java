package OOPS.Interface;

import java.util.Scanner;

interface Device {
    String turnOn();
    String turnOff();
}

class Fan implements Device {
    public String turnOn(){
        return "Fan On";
    }    

    public String turnOff(){
        return "Fan Off";
    }
}

class Light implements Device {
    public String turnOn(){
        return "Light On";
    }    

    public String turnOff(){
        return "Light Off";
    } 
}

class AC implements Device {
    public String turnOn(){
        return "AC On";
    }    

    public String turnOff(){
        return "AC Off";
    }   
}
public class Device_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Device d[]=new Device[3];
        d[0]=new Fan();
        d[1]=new Light();
        d[2]=new AC();

        for(int i=0; i<d.length; i++){
            System.out.println(d[i].turnOn());
            System.out.println( d[i].turnOff());
            System.out.println();
        }
        sc.close();
    }
}
