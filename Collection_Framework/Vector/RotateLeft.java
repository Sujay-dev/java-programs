package CollectionFramework.Vector;

import java.util.Vector;

public class RotateLeft {
    public static void main(String[] args) {
      Vector<Integer> vector=new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.addElement(50);
        
        int first=vector.firstElement();
        vector.remove(0);
        vector.addElement(first);
        

        System.out.println(vector);
    }
}
