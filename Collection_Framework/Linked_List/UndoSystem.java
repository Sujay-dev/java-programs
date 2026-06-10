package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class Tasks{
    private String task;

    Tasks(String task){
        this.task=task;
    }

    public String gettask(){
        return task;
    }
}
public class UndoSystem {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Tasks> list1=new LinkedList<>();

        while (true) {
            System.out.println("1 for Add Action");
            System.out.println("2 for undo");
            System.out.println("3 for Show Actions");
            System.out.println("4 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Add task");
                    String task=sc.nextLine();

                    list1.add(new Tasks(task));
                    System.out.println("Task Added");
                    System.out.println();
                    break;

                case 2:
                    if (list1.isEmpty()) {
                        System.out.println("List is Empty");
                        break;
                    }
                    Tasks removed=list1.removeLast();
                    System.out.println("Undone: " + removed);
                    System.out.println();
                    System.out.println("Remaining Task: ");
                    for (Tasks t : list1) {
                        System.out.println(t.gettask());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Actions: ");
                    for (Tasks t : list1) {
                        System.out.println(t.gettask());
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
