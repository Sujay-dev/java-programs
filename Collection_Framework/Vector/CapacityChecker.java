package CollectionFramework.Vector;

import java.util.Vector;

public class CapacityChecker {
    public static void main(String[] args) {
         Vector<Integer> vector=new Vector<>();

         System.out.println(vector.capacity());

        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.addElement(50);
        vector.addElement(60);
        vector.addElement(70);
        vector.addElement(80);
        vector.addElement(90);
        vector.addElement(100);
        vector.addElement(110);
        vector.addElement(120);
        vector.addElement(130);
        vector.addElement(140);
        vector.addElement(150);

        System.out.println(vector.size());
        System.out.println(vector.capacity());
    }
}
