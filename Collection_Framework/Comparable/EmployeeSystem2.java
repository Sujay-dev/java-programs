package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee2 implements Comparable<Employee2>{
    private int id;
    private String name;
    private String department;
    private int salary;

    Employee2(int id,String name,String department,int salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public int compareTo(Employee2 e){
        if (this.salary==e.salary) {
            return this.department.compareTo(e.department);
        }
        return Integer.compare(e.salary,this.salary);
    }
   
}
public class EmployeeSystem2 {
    public static void main(String[] args) {
        ArrayList<Employee2> list=new ArrayList<>();

        Employee2 e1=new Employee2(101, "Sujay","HR", 80000);
        Employee2 e2=new Employee2(102, "Vedant","IT", 50000);
        Employee2 e3=new Employee2(103, "Suyash","HR", 80000);
        Employee2 e4=new Employee2(104, "Rohan","IT", 70000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getDepartment() +  " " + list.get(i).getSalary());
        }
    }
}
