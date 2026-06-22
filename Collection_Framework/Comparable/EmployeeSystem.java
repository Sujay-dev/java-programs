package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
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

    @Override
    public int compareTo(Employee e){
        return this.salary-e.salary;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();

        Employee e1=new Employee(101, "Sujay", 80000);
        Employee e2=new Employee(102, "Vedant", 50000);
        Employee e3=new Employee(103, "Suyash", 60000);
        Employee e4=new Employee(104, "Rohan", 70000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getSalary());
        }
    }
}
