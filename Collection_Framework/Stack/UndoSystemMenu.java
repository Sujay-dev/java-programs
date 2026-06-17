package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

class Undo{
    private String task;

    Undo(String task){
        this.task=task;
    }

    public String getTask(){
        return task;
    }
}
public class UndoSystemMenu {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Undo> stack=new Stack<>();
        
        while (true) {
            System.out.println("1 for Add Task");
            System.out.println("2 for Undo Task");
            System.out.println("3 for view first task to do");
            System.out.println("4 for View Tasks");
            System.out.println("5 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Task: ");
                    String task=sc.nextLine();

                    stack.push(new Undo(task));
                    System.out.println("Task Added !");
                    System.out.println();
                    break;
            
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("List is empty");
                        break;
                    }
                    stack.pop();
                    System.out.println("Removed last task !");
                    System.out.println();
                    break;

                case 3:
                     if (stack.isEmpty()) {
                        System.out.println("List is empty");
                        break;
                    }
                    System.out.println("The current task to do is: " + stack.lastElement().getTask());
                    System.out.println();
                    break;

                case 4:
                     if (stack.isEmpty()) {
                        System.out.println("List is empty");
                        break;
                    }
                    System.out.println("Tasks ToDo");
                    for (Undo u : stack) {
                        System.out.println(u.getTask());
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
