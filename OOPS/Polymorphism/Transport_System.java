package OOPS.Polymorphism;

import java.util.Scanner;

class Transport {
    private int distance;
    
    Transport(int distance){
        setDistance(distance);
    }
    public void setDistance(int distance){
        if (distance>0) {
            this.distance=distance;
        }else{
            this.distance=0;
        }
    }

    public int getDistance(){
        return distance;
    }

    public int fare(){
        return 0;
    }

    public String getName(){
        return"";
    }
}

class Bus extends Transport {

    public String getName(){
        return "Bus";
    }

    Bus(int distance){
        super(distance);
    }   

    @Override
    public int fare(){
        return getDistance()*5;
    }
}

class Train extends Transport {
    
     public String getName(){
        return "Train";
    }

    Train(int distance){
        super(distance);
    }

    @Override
    public int fare(){
        return getDistance()*3;
    }
}

class Taxi extends Transport {
    
     public String getName(){
        return "Taxi";
    }

    Taxi(int distance){
        super(distance);
    }

    @Override
    public int fare(){
        return getDistance()*10;
    }
}
public class Transport_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int distance=sc.nextInt();

        Transport t[]=new Transport[3];
        t[0]=new Bus(distance);
        t[1]=new Train(distance);
        t[2]=new Taxi(distance);

        for(int i=0; i<t.length; i++){
            System.out.println("Distance : "+distance);
            System.out.println(t[i].getName()+" Fare : "+ t[i].fare());
        }
        sc.close();
    }
}
