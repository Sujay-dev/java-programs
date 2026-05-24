package Projects;

import java.util.Scanner;

interface Match{
    int play(int runs);
    String getMatchFormat();
    String getStatus(int runs);
    double getRunRate(int runs, int balls);
    default String getMatchID(){
        int number=(int)(Math.random()*100000);
        return "MATCH" + number;
    }
}

class T20Match implements Match {
    
    public int play(int runs){
        return runs;
    }

    public String getMatchFormat(){
        return "T20";
    }

      public String getStatus(int runs) {
        if (runs < 120) return "Low Score";
        else if (runs <= 180) return "Competitive";
        else return "High Score";
    }

    public double getRunRate(int runs, int balls){
        return ((runs / (double)balls)*6);
    }
}

class OneDayMatch implements Match {

    public int play(int runs){
        return runs;
    }

    public String getMatchFormat(){
        return "OneDay";
    }

     public String getStatus(int runs) {
        if (runs < 200) return "Low Score";
        else if (runs <= 300) return "Balanced";
        else return "Big Score";
    }

    public double getRunRate(int runs, int balls){
        return ((runs / (double)balls)*6);
    }
}

class TestMatch implements Match{
   

    public int play(int runs){
        return runs;
    }

    public String getMatchFormat(){
        return "Test";
    }

     public String getStatus(int runs) {
        if (runs < 250) return "Struggling";
        else if (runs <= 400) return "Stable";
        else return "Dominating";
    }

    public double getRunRate(int runs, int balls){
        return ((runs / (double)balls)*6);
    }
}
public class Cricket_Match_Score_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Match Format(T20 / OneDay / Test)");
        String matchFormat=sc.nextLine();
        System.out.println("Enter Runs: ");
        int runs=sc.nextInt();
        System.out.println("Enter Balls: ");
        int balls=sc.nextInt();

        if (runs<=0 || balls<=0) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        Match m;

        if (matchFormat.equalsIgnoreCase("T20")) {
            m=new T20Match();
        }
        else if (matchFormat.equalsIgnoreCase("OneDay")) {
            m=new OneDayMatch();
        }
        else if (matchFormat.equalsIgnoreCase("Test")) {
            m=new TestMatch();
        }
        else{
            System.out.println("Invalid Format");
            sc.close();
            return;
        }

        System.out.println(m.getMatchFormat() + " Match: " + m.play(runs) + " | " + m.getMatchID() + " | Status: " + m.getStatus(runs) + " | RunRate: " + m.getRunRate(runs, balls));
        sc.close();
    }
}
