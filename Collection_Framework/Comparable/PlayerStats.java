package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Player implements Comparable<Player>{
    private int jerseyNo;
    private String name;
    private int score;

    Player(int jerseyNo,String name,int score){
        this.jerseyNo=jerseyNo;
        this.name=name;
        this.score=score;
    }
    public int getJerseyNo(){
        return jerseyNo;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    @Override
    public int compareTo(Player p){
        if(this.score != p.score)
          return Integer.compare(p.score, this.score);

         if(!this.name.equals(p.name))
          return this.name.compareTo(p.name);

         return Integer.compare(this.jerseyNo, p.jerseyNo);
    }
}
public class PlayerStats {
    public static void main(String[] args) {
        List<Player> list=new ArrayList<>();

        Player p1=new Player(07, "M.S.Dhoni", 50);
        Player p2=new Player(18, "Virat Kohli", 100);
        Player p3=new Player(45, "Rohit Sharma", 79);
        Player p4=new Player(31, "R.D.Gaikwad", 66);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println("Jersey No: " + list.get(i).getJerseyNo() + " Name: " + list.get(i).getName() + " Score: " + list.get(i).getScore());
        }
    }
}
