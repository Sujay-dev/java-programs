package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Patient{
    private String aadhar;       
    private String name;
    private int age;
    private String bloodGroup;

   Patient(String aadhar,String name, int age, String bloodGroup){
    this.aadhar=aadhar;
    this.name=name;
    this.age=age;
    this.bloodGroup=bloodGroup;
   }

    public String getAadhar(){
        return aadhar;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBloodGroup(){
        return bloodGroup;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Patient)) return false;
        Patient other=(Patient) obj;
        return this.aadhar.equals(other.aadhar);
    }

    @Override
    public int hashCode(){
        return this.aadhar.hashCode();
    }
}
public class PatientEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Patient,String> map=new HashMap<>();

        Patient p1=new Patient("1290873474798", "Sujay", 50,"A+");
        Patient p2=new Patient("1290873474798", "Sujay Kamble", 45,"A+");

        map.put(p1, "Accident Patient");
        map.put(p2, "Heart Attack Patient");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getAadhar() + " -> " + s.getValue());
        }

        System.out.println(map.size());
        sc.close();
    }
}
