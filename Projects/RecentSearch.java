package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class SearchManager{
    private String search;

    SearchManager(String search){
        this.search=search;
    }

    public String getSearch(){
        return search;
    }

}
public class RecentSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<SearchManager> list1=new LinkedList<>();

        while (true) {
            System.out.println("1 for search");
            System.out.println("2 for Show search");
            System.out.println("3 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Add search: ");
                    String search=sc.nextLine();

                    if (list1.size()>=5) {
                        list1.removeFirst();
                    }
                    list1.addLast(new SearchManager(search));
                    System.out.println("Search Added");

                    System.out.println();
                    break;

                case 2:
                    if (list1.isEmpty()) {
                        System.out.println("List is Empty");
                        break;
                    }
                    System.out.println("Searches: ");
                    for (SearchManager s : list1) {
                        System.out.println(s.getSearch());
                    }
                    System.out.println();
                    break;
            
                case 3:
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
