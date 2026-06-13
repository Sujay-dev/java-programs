package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

class Redo{
    private String task;

    Redo(String task){
        this.task=task;
    }
    public String getTask(){
        return task;
    }
}
public class RedoSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Redo> undo=new Stack<>();
        Stack<Redo> redo=new Stack<>();

        while (true) {
            System.out.println("1 for Add Action");
            System.out.println("2 for Undo");
            System.out.println("3 for redo");
            System.out.println("4 for Show Tasks");
            System.out.println("5 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Add Task");
                    String task=sc.nextLine();

                    undo.push(new Redo(task));
                    redo.push(new Redo(task));
                    System.out.println("Task Added");
                    System.out.println();
                    break;
            
                case 2:
                    Redo r = undo.pop();
                    redo.push(r);
                    System.out.println("Undo");
                    System.out.println();
                    break;

                case 3:
                    Redo u = redo.pop();
                    undo.push(u);
                    System.out.println("Redo");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Tasks");
                    for (Redo n : undo) {
                        System.out.println(n.getTask());
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
