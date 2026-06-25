package Maps.Treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Player{
    private int jerseyNo;
    private String name;
    private int score;

    Player(int no,String name,int score){
        this.jerseyNo=no;
        this.name=name;
        this.score=score;
    }
    public int getNo(){
        return jerseyNo;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}
public class ScoreCard {
    public static void main(String[] args) {
        TreeMap<Player,String> map=new TreeMap<>(Comparator.comparing(Player :: getScore).reversed().thenComparing(Comparator.comparing(Player :: getNo)));

        Player p1=new Player(07, "Dhoni", 50);
        Player p2=new Player(18, "Virat", 100);
        Player p3=new Player(45, "Rohit", 265);
        Player p4=new Player(10, "Sachin", 155);
        Player p5=new Player(03, "Raina", 87);
        Player p6=new Player(8, "Jadeja", 72);
        Player p7=new Player(25, "Dube", 54);
        Player p8=new Player(25, "Dhawan", 97);
        Player p9=new Player(31, "R.D.Gaikwad", 108);
        Player p10=new Player(1, "K.L.Rahul", 152);
        Player p11=new Player(31, "Pandya", 92);

        map.put(p1, "Player");
        map.put(p2, "Player");
        map.put(p3, "Player");
        map.put(p4, "Player");
        map.put(p5, "Player");
        map.put(p6, "Player");
        map.put(p7, "Player");
        map.put(p8, "Player");
        map.put(p9, "Player");
        map.put(p10, "Player");
        map.put(p11, "Player");

        for (var s : map.entrySet()) {
            System.out.println("Jersey No: "+ s.getKey().getNo() + " Name: " + s.getKey().getName() + " Score: " +s.getKey().getScore());
        }
        System.out.println();
        System.out.println("Top Player: Jersey No: " + map.firstKey().getNo() + " Name: " + map.firstKey().getName() + " Score: " + map.firstKey().getScore());
        System.out.println();
        System.out.println("Bottom Player: Jersey No: " + map.lastKey().getNo() + " Name: " + map.lastKey().getName() + " Score: " + map.lastKey().getScore());

        System.out.println();
        System.out.println("Player with score greater than 100: ");
        for (var s : map.entrySet()) {
            if (s.getKey().getScore()>=100) {
            System.out.println("Jersey No: "+ s.getKey().getNo() + " Name: " + s.getKey().getName() + " Score: " +s.getKey().getScore());
        }
    }
    }
}
