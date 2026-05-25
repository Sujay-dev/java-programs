package Projects;

import java.util.Scanner;

interface Match{
    String getMatchFormat();
    String getStatus(int runs);
    default double getRunRate(int runs, int balls){
         return ((runs / (double)balls)*6);
    }
    default String getMatchID(){
        int number=(int)(Math.random()*100000);
        return "MATCH" + number;
    }
}

class T20Match implements Match {

    public String getMatchFormat(){
        return "T20";
    }

      public String getStatus(int runs) {
        if (runs < 120) return "Low Score";
        else if (runs <= 180) return "Competitive";
        else return "High Score";
    }
}

class OneDayMatch implements Match {

    public String getMatchFormat(){
        return "OneDay";
    }

     public String getStatus(int runs) {
        if (runs < 200) return "Low Score";
        else if (runs <= 300) return "Balanced";
        else return "Big Score";
    }
}

class TestMatch implements Match{

    public String getMatchFormat(){
        return "Test";
    }

     public String getStatus(int runs) {
        if (runs < 250) return "Struggling";
        else if (runs <= 400) return "Stable";
        else return "Dominating";
    }
}

class IPLMatch implements Match{
  
    public String getMatchFormat(){
        return "IPL";
    }

    public String getStatus(int runs){
        if (runs<150)  return "Average";
        else if (runs<=200) return "Good";
        else return "Explosive";
    }
}
class MatchFactory {

    public static Match getMatch(String type) {

        if (type.equalsIgnoreCase("T20")) {
            return new T20Match();
        }
        else if (type.equalsIgnoreCase("OneDay")) {
            return new OneDayMatch();
        }
        else if (type.equalsIgnoreCase("Test")) {
            return new TestMatch();
        }
        else if (type.equalsIgnoreCase("IPL")) {
            return new IPLMatch();
        }

        return null;
    }
}
public class Cricket_Match_Score_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Match Format(T20 / OneDay / Test / IPL)");
        String matchFormat=sc.nextLine();
        System.out.println("Enter Runs: ");
        int runs=sc.nextInt();
        System.out.println("Enter Balls: ");
        int balls=sc.nextInt();

        if (runs < 0 || balls <= 0) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        Match m=MatchFactory.getMatch(matchFormat);

        if (m==null) {
            System.out.println("Invalid Format");
            sc.close();
            return;
        }

        System.out.println("Match Format: " + m.getMatchFormat() + " Match " + " | " +  "Score: " + runs + "runs" + " | " + "Match ID: " + m.getMatchID() + " | Status: " + m.getStatus(runs) + " | RunRate: " + String.format("%.2f", m.getRunRate(runs, balls)));
        sc.close();
    }
}
