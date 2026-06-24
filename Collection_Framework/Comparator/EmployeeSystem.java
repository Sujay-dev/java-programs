package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        List<Employee> list =new ArrayList<>();

        Employee e1=new Employee(101, "Sujay Kamble", 50000);
        Employee e2=new Employee(102, "Vedant Kanase", 20000);
        Employee e3=new Employee(103, "Rohan Jagtap", 35000);
        Employee e4=new Employee(104, "Suyash Desai", 40000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        list.sort(Comparator.comparing(Employee :: getSalary).reversed().thenComparing(Employee :: getName));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getSalary());
        }
    }
}
