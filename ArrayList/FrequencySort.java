package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class FrequencyNum{
    private int num;
    private int count;

    FrequencyNum(int num,int count){
        this.num=num;
        this.count=count;
    }

    public void setCount(int count){
        this.count=count;
    }
    public int getNum(){
        return num;
    }
    public int getCount(){
        return count;
    }
}
public class FrequencySort {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<6; i++){
            list.add(sc.nextInt());
        }

        ArrayList<FrequencyNum> freqlist=new ArrayList<>();

        for(int i=0; i<list.size(); i++){
            boolean exists=false;

            for(int j=0; j<i; j++){
                if (list.get(i).equals(list.get(j))) {
                    exists=true;
                    break;
                }
            }

            if (exists) {
                continue;
            }

            int count=0;

            for(int k=0; k<list.size(); k++){
                if (list.get(i).equals(list.get(k))) {
                    count++;
                }
            }

            freqlist.add(new FrequencyNum(list.get(i), count));
        }

        Collections.sort(freqlist,(a,b) -> b.getCount()-a.getCount());

        for (FrequencyNum f : freqlist) {
            System.out.println(f.getNum() + " -> " + f.getCount());
        }
        sc.close();
    }
}
