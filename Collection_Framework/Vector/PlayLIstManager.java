package CollectionFramework.Vector;

import java.util.Scanner;
import java.util.Vector;

class Playlist{
    private String song;

    Playlist(String song){
        setSong(song);
    }

    public void setSong(String song){
        if (song!=null && !song.isEmpty()) {
            this.song=song;
        }else{
            this.song="Unknown";
        }
    }

    public String getSong(){
        return song;
    }
}
public class PlayLIstManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Vector<Playlist> vector=new Vector<>();

        while (true) {
            System.out.println("1 for Add song");
            System.out.println("2 for Remove song");
            System.out.println("3 for view first song");
            System.out.println("4 for view last song");
            System.out.println("5 for Display PlayList");
            System.out.println("6 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Song: ");
                    String song=sc.nextLine();

                    vector.add(new Playlist(song));
                    System.out.println("Song Added to PlayList !");
                    System.out.println();
                    break;
        
                case 2:
                    if (vector.isEmpty()) {
                        System.out.println("Playlist is Empty");
                        break;
                    }

                    System.out.println("Enter Song name for deleting from playlist: ");
                    sc.nextLine();
                    String deletesong=sc.nextLine();
                    boolean delete=false;

                    for(int i=0; i<vector.size(); i++){
                        if (vector.get(i).getSong().equals(deletesong)) {
                            vector.remove(i);
                            delete=true;
                        }
                    }

                    if (delete) {
                        System.out.println("Song is deleted from Playlist");
                    }else{
                        System.out.println("Song doesn't Exist in playlist");
                    }

                    System.out.println();
                    break;

                case 3:
                    if (vector.isEmpty()) {
                        System.out.println("Playlist is Empty");
                        break;
                    } 

                    System.out.println("First Song in Playlist: ");
                    System.out.println(vector.firstElement().getSong());
        
                    System.out.println();
                    break;

                case 4:
                     if (vector.isEmpty()) {
                        System.out.println("Playlist is Empty");
                        break;
                    } 

                    System.out.println("Last song in PlayList: ");
                    System.out.println(vector.lastElement().getSong());
                       
                    System.out.println();
                    break;

                case 5:
                    if (vector.isEmpty()) {
                        System.out.println("Playlist is Empty");
                        break;
                    }

                    System.out.println("--------PlayList--------");

                    for (Playlist p : vector) {
                        System.out.println(p.getSong());
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
