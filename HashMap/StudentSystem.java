package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();

        while (true) {
            System.out.println("1 for Add Student");
            System.out.println("2 for View All Students");
            System.out.println("3 for Search by ID");
            System.out.println("4 for Remove Student");
            System.out.println("5 for Exit");

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

                    map.put(id, name);
                    System.out.println("Student Added");
                    System.out.println();
                    break;
        
                case 2:
                    if (map.keySet().isEmpty()) {
                        System.out.println("Map is Empty");
                        break;
                    }

                    System.out.println("---Student List---");
                    for (Integer key : map.keySet()) {
                        System.out.println(key + " -> " + map.get(key));
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

                            System.out.println("ID: " + searchId + " Name: " + map.get(searchId));
                            found=true;
                        }
                    }
                    if (!found) {
                        System.out.println("Not Found");
                    }
                    System.out.println();
                    break;

                case 4:
                   System.out.println("Enter ID for Removing: ");
                   int removeId=sc.nextInt();
                   if (map.containsKey(removeId)) {
                    System.out.println("Removed: ");
                    System.out.println("ID: " + removeId + " Name: " + map.get(removeId));

                    map.remove(removeId);
                   }else{
                    System.out.println("Invalid ID");
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
