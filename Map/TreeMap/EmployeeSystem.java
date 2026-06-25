package Maps.Treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee{
    private int id;
    private String name;
    private int salary;

    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Map<Employee,String> map=new TreeMap<>(Comparator.comparing(Employee :: getSalary).reversed().thenComparing(Comparator.comparing(Employee :: getId)));

        Employee e1=new Employee(103, "Vedant",20000);
        Employee e2=new Employee(101, "Sujay",50000);
        Employee e3=new Employee(104, "Rohan",20000);
        Employee e4=new Employee(102, "Suyash",45000);

        map.put(e3, "Employee");
        map.put(e1, "Employee");
        map.put(e4, "Employee");
        map.put(e2, "Employee");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " " + s.getKey().getName() + " " +s.getKey().getSalary() + " " +  s.getValue());
        }
    }
}
