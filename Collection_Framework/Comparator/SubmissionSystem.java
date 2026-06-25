package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Submission{
    private int submissionId;
    private String username;
    private int score;
    private int executionTime;

    Submission(int submissionId,String username,int score,int executionTime){
        this.submissionId=submissionId;
        this.username=username;
        this.score=score;
        this.executionTime=executionTime;
    }
    public int getId(){
        return submissionId;
    }
    public String getName(){
        return username;
    }
    public int getScore(){
        return score;
    }
    public int getExecutionTime(){
        return executionTime;
    }
}
public class SubmissionSystem {
    public static void main(String[] args) {
        List<Submission> list=new ArrayList<>();

        Submission s1=new Submission(101, "Sujay Kamble", 10, 5000);
        Submission s2=new Submission(103, "Suyash Desai", 7, 8000);
        Submission s3=new Submission(102, "Vedant Kanase", 8, 9400);
        Submission s4=new Submission(105, "Athrava Desai", 10, 2000);
        Submission s5=new Submission(104, "Rohan Jagtap", 9, 4000);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        list.sort(Comparator.comparingInt(Submission :: getScore).reversed().thenComparing(Submission :: getExecutionTime).thenComparing(Submission :: getName));

        for(int i=0; i<list.size(); i++){
            System.out.println("ID: " + list.get(i).getId() + " UserName: " + list.get(i).getName() + " Score: " + list.get(i).getScore() + " Execution Time: " + list.get(i).getExecutionTime() + "ms");
        }
    }
}
