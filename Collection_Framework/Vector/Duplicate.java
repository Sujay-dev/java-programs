package CollectionFramework.Vector;

import java.util.Vector;

public class Duplicate {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();

        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(10);
        vector.addElement(30);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);

       for(int i=0; i<vector.size(); i++){
        for(int j=i+1; j<vector.size(); j++){
            if (vector.get(i).equals(vector.get(j))) {
                vector.remove(j);
                j--;
            }
        }
       }

        System.out.println(vector);
    }
}
