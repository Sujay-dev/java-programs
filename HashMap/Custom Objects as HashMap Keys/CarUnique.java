package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Car {
    String licensePlate;  
    String model;
    
    Car(String licensePlate,String model){
        this.licensePlate=licensePlate;
        this.model=model;
    }

    public String getLicense(){
        return licensePlate;
    }

    public String getModel(){
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return this.licensePlate .equals(other.licensePlate);
    }

    @Override
    public int hashCode() {
        return this.licensePlate.hashCode();
    }
}
public class CarUnique {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Car,String> map=new HashMap<>();
       
        Car c1=new Car("MH 01 G 9353", "Toyota");
        Car c2=new Car("MH 01 G 9353", "Honda");

        map.put(c1,"Car1");
        map.put(c2,"Car2");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getLicense() + " -> " + s.getValue());
        }
        System.out.println(map.size());
        System.out.println();
        sc.close();
    }
}
