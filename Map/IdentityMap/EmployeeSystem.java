package Maps.IdentityMap;

import java.util.IdentityHashMap;

class Employee{
    private int id;
    private String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Employee)) return false;
        Employee other=(Employee) obj;
        return this.id==other.id;
    }

    @Override
    public int hashCode(){
        return this.id;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        IdentityHashMap<Employee,String> map=new IdentityHashMap<>();

        Employee e1=new Employee(101, "Sujay");
        Employee e2=new Employee(101, "Vedant");
        Employee e3=new Employee(102, "Rohan");

        map.put(e1, "Employee 1");
        map.put(e2, "Employee 2");
        map.put(e3, "Employee 3");

        System.out.println(map.size());

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " " +s.getKey().getName() + " -> " + s.getValue());
        }
    }
}
