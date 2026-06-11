package CollectionFramework.Vector;

import java.util.Vector;

public class Largest {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.addElement(50);

        int max=Integer.MIN_VALUE;

        for(int i=0; i<vector.size(); i++){
            if (vector.get(i)>max) {
                max=vector.get(i);
            }
        }

        System.out.println("Largest Element: " + max);
    }
}
