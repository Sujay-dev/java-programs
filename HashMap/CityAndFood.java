package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class CityAndFood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();

        map.put("VadaPav", "Mumbai");
        map.put("Biryani", "Hydrabad");
        map.put("Misal", "Pune");
        map.put("PavBhaji", "Mumbai");
        map.put("Mutton Thali", "Kolhapur");
        map.put("Chole Bhature", "Delhi");
        map.put("PaniPuri", "Pune");
        map.put("Lassi", "Delhi");

        HashMap<String,Vector<String>> map2=new HashMap<>();

        for (var s : map.entrySet()) {
            String food=s.getKey();
            String city=s.getValue();

            if (!map2.containsKey(city)) {
                map2.put(city, new Vector<>());
            }

            map2.get(city).add(food);
        }

        for (var s : map2.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
    }
}
