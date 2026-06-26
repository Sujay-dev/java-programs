package Sets.HashSet;

import java.util.HashSet;

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
    public boolean equals(Object o){
        if(!(o instanceof Employee)) return false;
        Employee other=(Employee) o;
        return this.id==other.id;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        HashSet<Employee> set=new HashSet<>();

        Employee e1=new Employee(101, "Sujay");
        Employee e2=new Employee(102, "Vedant");
        Employee e3=new Employee(101, "Sujay");
        Employee e4=new Employee(103, "Rohan");

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        System.out.println(set.size());

        for (Employee e : set) {
            System.out.println(e.getId() + " -> " + e.getName());
        }
    }
}
