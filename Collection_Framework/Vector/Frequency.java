package CollectionFramework.Vector;

import java.util.Vector;

public class Frequency {
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
            boolean found=false;
            for(int j=0; j<i; j++){
                if (vector.get(i).equals(vector.get(j))) {
                    found=true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            int count=1;

            for(int k=i+1; k<vector.size(); k++){
                if (vector.get(i).equals(vector.get(k))) {
                    count++;
                }
            }

            System.out.println(vector.get(i) + " -> " + count);
        }
    }
}
