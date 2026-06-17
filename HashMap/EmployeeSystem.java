package HashMap;

import java.util.HashMap;
import java.util.Scanner;

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
        HashMap<Integer,Employee> map=new HashMap<>();

        while (true) {
            System.out.println("1 for Add Employee");
            System.out.println("2 for View All Employees");
            System.out.println("3 for Search by ID");
            System.out.println("4 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name=sc.nextLine();

                    map.put(id, new Employee(id,name));
                    System.out.println("Employee Added");
                    System.out.println();
                    break;
        
                case 2:
                    if (map.keySet().isEmpty()) {
                        System.out.println("Map is Empty");
                        break;
                    }

                    System.out.println("---Employee List---");
                    for (Integer key : map.keySet()) {
                        Employee e=map.get(key);

                        System.out.println(key + " -> " + e.getName());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter ID for Searching: ");
                    int searchId=sc.nextInt();
                    boolean found=false;
                    for (Integer i  : map.keySet()) {
                        if (i==searchId) {
                            System.out.println("Found: ");
                            Employee e=map.get(searchId);

                            System.out.println("ID: " + e.getId() + " Name: " + e.getName());
                            found=true;
                        }
                    }
                    if (!found) {
                        System.out.println("Not Found");
                    }
                    System.out.println();
                    break;

                case 4:
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
