package CollectionFramework.CopyOnWriteArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

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
}
public class EmployeeSystem {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> list=new CopyOnWriteArrayList<>();

        for(int i=0; i<5; i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();

            list.add(new Employee(id, name));
        }

        
        for (Employee e : list) {
            System.out.println("ID: "+ e.getId() + " Name: " + e.getName() );
        }

        System.out.println();

        for (Employee e : list) {
            if (e.getId()==3) {
                list.remove(e);
                System.out.println("Removed Employee With ID 3");
            }
        }

        System.out.println();
        
        for (Employee e : list) {
            System.out.println("ID: "+ e.getId() + " Name: " + e.getName() );
        }
    }
}
