package Maps.WeakHashmap;

import java.util.WeakHashMap;

class Employee{
    private String name;

    Employee(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        WeakHashMap<Employee,String> map=new WeakHashMap<>();
        Employee e1=new Employee("Sujay");
        Employee e2=new Employee("Vedant");
        Employee e3=new Employee("Rohan");

        map.put(e1, "HR");
        map.put(e2, "IT");
        map.put(e3, "IT");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getName()+ " : " + s.getValue());
        }

        e2=null;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           
        }

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getName()+ " : " + s.getValue());
        }
    }
}
