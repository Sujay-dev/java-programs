package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Query {
    private String queryId;
    private int executionTime;
    private int rowsScanned;
    private int frequency;

    Query(String queryId,int executionTime,int rowsScanned,int frequency){
        this.queryId=queryId;
        this.executionTime=executionTime;
        this.rowsScanned=rowsScanned;
        this.frequency=frequency;
    }
    public String getId(){
        return queryId;
    }
    public int getExecutionTime(){
        return executionTime;
    }
    public int getRowScanned(){
        return rowsScanned;
    }
    public int getFrequency(){
        return frequency;
    }
}
public class DatabaseQueries {
    public static void main(String[] args) {
        List<Query> list=new ArrayList<>();

        Query q1=new Query("59jdhwufnvl", 1000, 3, 3);
        Query q2=new Query("9ujtnvbhjjg", 1000, 5, 4);
        Query q3=new Query("234rfcjnffn", 1000, 8, 10);
        Query q4=new Query("5rjfnvjnfjf", 1000, 1, 23);
        Query q5=new Query("12sjdnfhu8u", 1000, 2, 8);

        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
        list.add(q5);

        list.sort(Comparator.comparingInt(Query :: getFrequency).reversed().thenComparing(Query :: getExecutionTime).thenComparing(Query :: getRowScanned));

        for(int i=0; i<list.size(); i++){
            System.out.println("Query ID: " + list.get(i).getId() + " Execution Time: " + list.get(i).getExecutionTime() + " Rows Scanned: " + list.get(i).getRowScanned() + " Frequency: "+ list.get(i).getFrequency());
        }
    }
}
