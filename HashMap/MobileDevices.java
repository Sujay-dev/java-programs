package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Mobile{
    private String imei;       
    private String brand;
    private String model;
    private int year;

   Mobile(String imei,String brand,String model,int year){
    this.imei=imei;
    this.brand=brand;
    this.model=model;
    this.year=year;
   }

    public String getImei(){
        return imei;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Mobile)) return false;
        Mobile other=(Mobile) obj;
        return this.imei.equals(other.imei);
    }

    @Override
    public int hashCode(){
        return this.imei.hashCode();
    }
}
public class MobileDevices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Mobile,Integer> map=new HashMap<>();

        Mobile m1=new Mobile("1290873474798", "Samsung", "A15",2024);
        Mobile m2=new Mobile("1290873474798", "IPhone", "17 Pro Max",2026);

        map.put(m1, 1);
        map.put(m2, 2);

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getImei() + " -> " + s.getValue());
        }

        System.out.println(map.size());
        sc.close();
    }
}
