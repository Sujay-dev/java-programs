package CollectionFramework.Stack;

import java.util.Scanner;
import java.util.Stack;

class BrowserSystem{
    private String page;

    BrowserSystem(String page){
        this.page=page;
    }

    public String getPage(){
        return page;
    }
}
public class BrowserHistoryMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<BrowserSystem> browser=new Stack<>();

        while (true) {
            System.out.println("1 for Visit Page");
            System.out.println("2 for Back");
            System.out.println("3 for Current Page");
            System.out.println("4 for Show History");
            System.out.println("5 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter page link: ");
                    String page=sc.nextLine();

                    browser.add(new BrowserSystem(page));
                    System.out.println("Visited page");
                    System.out.println();
                    break;
            
                case 2:
                    browser.pop();
                    System.out.println("Pressed Back");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Current Page: ");
                    System.out.println(browser.lastElement().getPage());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("History");
                    for (BrowserSystem b : browser) {
                        System.out.println(b.getPage());
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
