package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private int salary;

    Employee(int id, String name, int salary){
        setID(id);
        setName(name);
        setSalary(salary);
    }

     public void setID(int id){
        if (id>0) {
            this.id=id;
        }else{
            this.id=0;
        }
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            this.salary=0;
        }
    }

    public int getSalary(){
        return salary;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Employee> employees=new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add employee");
            System.out.println("Enter 2 for view Employee");
            System.out.println("Enter 3 for Search Employee");
            System.out.println("Enter 4 for update Employee");
            System.out.println("Enter 5 for delete Employee");
            System.out.println("Enter 6 for view Employee with highest salary");
            System.out.println("Enter 7 for Exit");

            System.out.println();

            int choice=sc.nextInt();
            
            System.out.println();

            switch (choice) {

                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                   System.out.println("Enter Name:");
                   String name = sc.nextLine();

                   System.out.println("Enter Salary: ");
                   int salary=sc.nextInt();

                   boolean exists = false;

                   for(Employee e : employees){
                   if(e.getId() == id){
                   exists = true;
                   break;
                   }
                  }

                if(exists){
                System.out.println("ID Already Exists");
                 }else{
                employees.add(new Employee(id,name,salary));
                System.out.println("Employee Added");
                 }

                 System.out.println();

                 break;

                case 2:
                     for(Employee e: employees){
                     System.out.println("ID: " + e.getId() + " Name: "+ e.getName() + " Salary: " + e.getSalary());
                    }

                    System.out.println();

                    break;
            
                case 3:
                    System.out.println("Enter Id for Search");
                    int searchId=sc.nextInt();
                    boolean found=false;

                    for(Employee e:employees){
                    if (e.getId()==searchId) {
                    System.out.println("Found: " + " ID: "+ e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
                    found=true;
                    break;
                    }
                }
                    if (!found) {
                    System.out.println("Not Found");
                }

                System.out.println();

                break;

                case 4:
                    System.out.println("Enter ID to Update salary");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Salary");
                    int newsalary=sc.nextInt();
                    boolean update=false;

                    for (Employee e : employees) {
                    if (e.getId()==updateId) {
                    e.setSalary(newsalary);
                    update=true;
                }
                }

                   if (update) {
                   System.out.println("Updated");
                   }else{
                    System.out.println("Not found");
                   }

                  for(Employee e: employees){
                  System.out.println("ID: " + e.getId() + " Name: "+ e.getName() + " Salary: " + e.getSalary());
                  }

                  System.out.println();

                  break;

                case 5:
                    System.out.println("Enter ID to delete");
                     int deleteId=sc.nextInt();
                     boolean delete=false;

                     for(int i=0; i<employees.size(); i++){
                     if (employees.get(i).getId()==deleteId) {
                     employees.remove(i);
                     delete=true;
                    }
                    }

                   if (delete) {
                   System.out.println("Deleted");
                   }else{
                   System.out.println("Not Deleted");
                   }

                   for(Employee e: employees){
                   System.out.println("ID: " + e.getId() + " Name: "+ e.getName() + " Salary: " + e.getSalary());
                   }

                   System.out.println();

                   break;

                case 6:
                    if (employees.isEmpty()) {
                        System.out.println("Employee not available");
                        break;
                    }
                     Employee highsalary=employees.get(0);

                     for(Employee e: employees){
                     if (e.getSalary()>highsalary.getSalary()) {
                     highsalary=e;
                    }
                    }

                    System.out.println("Employee with Highest Salary ");
                    System.out.println("ID : " + highsalary.getId());
                    System.out.println("Name: " + highsalary.getName());
                    System.out.println("Salary : "+ highsalary.getSalary());
                    
                    System.out.println();

                    break;

                case 7:
                    System.out.println("Exited !");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
