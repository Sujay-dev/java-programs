package Maps.LinkedHashmap;

import java.util.LinkedHashMap;

public class HighestMarks {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        map.put(101, 82);
        map.put(102, 62);
        map.put(103, 68);
        map.put(104, 67);
        map.put(105, 70);

        int max=Integer.MIN_VALUE;
        int top=-1;

        for (var s: map.entrySet()) {
            if (s.getValue()>max) {
                max=s.getValue();
                top=s.getKey();
            }
        }

        System.out.println("Highest Marks: ");
        System.out.println("ID: " + top);
        System.out.println("Marks: " + max);
    }
}
