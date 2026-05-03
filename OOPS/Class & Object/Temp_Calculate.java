package OOPS;

import java.util.Scanner;

class Temprature {
    private int celcius;

    Temprature(int celcius){
        setCelcius(celcius);
    }

    public void setCelcius(int celcius){
    if(celcius >= -273) {   
        this.celcius = celcius;
    } else {
        this.celcius = -273;
    }
}

    public int getCelcius(){
        return celcius;
    }

    public float tofahrenheit(){
        return (celcius * 9.0f / 5) + 32;
    }

    void display(){
        System.out.println("Temprature after converting into fahrenheit : " +tofahrenheit());
    }
}

public class Temp_Calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temprature in celcius : ");
        int celcius=sc.nextInt();
        Temprature t1=new Temprature(celcius);

        t1.display();
        sc.close();
    }
}
