package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Exam {

    public boolean isValid(int score){
            return score>=0 && score<=100;
        
    }
    abstract String calculateMarks(int score);
}

class McqExam extends Exam {
    @Override
    public String calculateMarks(int score){
        if (!isValid(score)) {
            return "Invalid Marks";
        }
        return "MCQ Exam Score: "+ score;
    }    
}

class PracticleExam extends Exam {
    public static final int extra=10;
    
    @Override
    public String calculateMarks(int score){
        if (!isValid(score)) {
            return "Invalid Marks";
        }
        return "Practicle Exam Score: " +(score+extra);
    }
}

class VivaExam extends Exam {
    public static final int extra=5;
    
    @Override
    public String calculateMarks(int score){
        if (!isValid(score)) {
            return "Invalid Marks";
        }
        return "Viva Exam Score: " +(score+extra);
    }    
}
public class ExamEvaluation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int score=sc.nextInt();

        Exam e[]=new Exam[3];
        e[0]=new McqExam();
        e[1]=new PracticleExam();
        e[2]=new VivaExam();

        for(int i=0; i<e.length; i++){
            System.out.println(e[i].calculateMarks(score));
        }
        sc.close();
    }
}
