package CollectionFramework.Vector;

import java.util.Vector;

public class AddandDisplay {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.addElement(50);

        System.out.println(vector);
    }
}
