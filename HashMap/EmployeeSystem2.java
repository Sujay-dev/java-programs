package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Employee2{
    private int id;
    private String name;

    Employee2(int id, String name){
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
public class EmployeeSystem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Employee2> map=new HashMap<>();

        while (true) {
            System.out.println("1 for Add Employee");
            System.out.println("2 for Search Employee");
            System.out.println("3 for Remove Employee");
            System.out.println("4 Display All Employee");
            System.out.println("5 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name=sc.nextLine();

                    map.put(id, new Employee2(id, name));
                    System.out.println("Employee Added !");
                    break;
            
                case 2:
                    if (map.isEmpty()) {
                        System.out.println("Map is Empty");
                        break;
                    }
                    System.out.println("Enter Id for Seraching Emploee: ");
                    int searchId=sc.nextInt();
                    boolean found=false;

                    if (map.containsKey(searchId)) {
                        System.out.println("Found: " + "ID: " + searchId + " Name: " + map.get(searchId).getName());
                        found=true;
                    }
                    if (!found) {
                        System.out.println("Invalid ID");
                    }
                    System.out.println();
                    break;

                case 3:
                     if (map.isEmpty()) {
                        System.out.println("Map is Empty");
                        break;
                    }
                    System.out.println("Enter ID for Deleting: ");
                    int deleteId=sc.nextInt();
                    boolean delete=false;

                    if (map.containsKey(deleteId)) {
                        System.out.println("Removed : ");
                        System.out.println("ID: " + deleteId);
                        System.out.println("Name: " + map.get(deleteId).getName());
                        delete=true;
                        map.remove(deleteId);
                    }
                    if (!delete) {
                        System.out.println("Invalid ID");
                    }
                    System.out.println();
                    break;

                case 4:
                     if (map.isEmpty()) {
                        System.out.println("Map is Empty");
                        break;
                    }
                    System.out.println("----Employee List----");
                    for (Employee2 s : map.values()) {
                        System.out.println("ID - "+s.getId() + " Name- " + s.getName());
                    }
                    System.out.println();
                    break;

                case 5:
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
