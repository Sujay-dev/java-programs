package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Employees{
    private String empId;       
    private String name;
    private String department;
    private double salary;

    Employees(String empId, String name, String department, double salary){
        this.empId=empId;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }

     public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Employees)) return false;
        Employees other=(Employees) obj;
        return this.empId.equals(other.empId);
    }

    @Override
    public int hashCode(){
        return this.empId.hashCode();
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Employees,String> map=new HashMap<>();

        Employees e1=new Employees("SUJemp59", "Sujay", "IT", 50000);
        Employees e2=new Employees("SUJemp59", "Sujay Kamble", "IT", 50000);

        map.put(e1, "Developer");
        map.put(e2, "Manager");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getEmpId() + " -> " + s.getValue());
        }

        System.out.println(map.size());
        sc.close();
    }
}
