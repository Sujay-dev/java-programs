package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User
{
    private String username;
    private int score;
    private int matchesPlayed;

    User(String username,int score, int matchesPlayed){
        this.username=username;
        this.score=score;
        this.matchesPlayed=matchesPlayed;
    }
    public String getName(){
        return username;
    }
    public int getScore(){
        return score;
    }
    public int getMatches(){
        return matchesPlayed;
    }
}
public class UserRank {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();

        User u1=new User("Virat Kohli", 100, 257);
        User u2=new User("M.S.Dhoni", 50, 357);
        User u3=new User("Rohit Sharma", 265, 242);

        list.add(u1);
        list.add(u2);
        list.add(u3);

        list.sort(Comparator.comparing(User :: getScore).reversed().thenComparing(Comparator.comparing(User :: getMatches).thenComparing(User :: getName)));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getName() + " " + list.get(i).getScore() + " " + list.get(i).getMatches());
        }
    }
}
