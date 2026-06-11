package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class Train{
    private int coach;

    Train(int coach){
        setCoach(coach);
    }

    public void setCoach(int coach){
        if (coach>0) {
            this.coach=coach;
        }else{
            this.coach=0;
        }
    }

    public int getCoach(){
        return coach;
    }
}
public class TrainReservationMenu {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        LinkedList<Train> list=new LinkedList<>();
        
        while (true) {
            System.out.println("1 for Add Front coach");
            System.out.println("2 for Add rear coach");
            System.out.println("3 for Remove Front coach");
            System.out.println("4 for Remove Rear coach");
            System.out.println("5 for Display");
            System.out.println("6 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Add Front Coach");
                    int frontcoach=sc.nextInt();

                    boolean exists=false;
                    for (Train t : list) {
                        if (t.getCoach()==frontcoach) {
                            exists=true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Duplicate Coach Enter Again");
                    }else{
                        list.addFirst(new Train(frontcoach));
                    }
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println("Add Rear Coach");
                    int rearcoach=sc.nextInt();

                    boolean exist=false;
                    for (Train t : list) {
                        if (t.getCoach()==rearcoach) {
                            exist=true;
                            break;
                        }
                    }

                    if (exist) {
                        System.out.println("Duplicate Coach Enter Again");
                    }else{
                        list.addLast(new Train(rearcoach));
                    }
                    System.out.println();
                    break;

                case 3:
                    if(!list.isEmpty()){
                    list.removeFirst();
                    }else{
                        System.out.println("List is Empty");
                    }

                    System.out.println("Train Coach List:");
                    for (Train t : list) {
                        System.out.print(t.getCoach() + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    if (!list.isEmpty()) {
                         list.removeLast();
                    }else{
                        System.out.println("List is Empty");
                    }
                    
                    System.out.println("Train Coach List:");
                    for (Train t : list) {
                        System.out.print(t.getCoach() + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Train Coach List:");
                    for (Train t : list) {
                        System.out.print(t.getCoach() + " ");
                    }
                    System.out.println();
                    break;

                case 6: 
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
