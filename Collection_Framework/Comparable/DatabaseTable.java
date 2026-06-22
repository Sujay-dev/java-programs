package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Table implements Comparable<Table>{
    private String tableName;
    private long rows;
    private int indexCount;

    Table(String tablename,long rows,int indexCount){
        this.tableName=tablename;
        this.rows=rows;
        this.indexCount=indexCount;
    }
    public String getTableName(){
        return tableName;
    }
    public long getRows(){
        return rows;
    }
    public int getIndexCount(){
        return indexCount;
    }

    @Override
    public int compareTo(Table t){
        if(this.rows!=t.rows)
            return (int) (t.rows-this.rows);
        if(this.indexCount!=t.indexCount)
            return Integer.compare(t.indexCount, this.indexCount);
        return this.tableName.compareTo(t.tableName);
    }
}
public class DatabaseTable {
    public static void main(String[] args) {
        List<Table> list=new ArrayList<>();

        Table t1=new Table("Login Table", 4, 18);
        Table t2=new Table("Admin Table", 3, 10);
        Table t3=new Table("Customer Table", 3, 10);
        Table t4=new Table("Order Table", 5, 8);
        Table t5=new Table("Bill Table", 6, 17);

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getTableName() + " " + list.get(i).getRows() + " " + list.get(i).getIndexCount());
        }
    }
}
