package Maps.Concurrentmap;

import java.util.EnumMap;
import java.util.Map;

enum Department {
    HR,
    DEVELOPMENT,
    TESTING,
    SALES
}
public class EnumDepartment {
    public static void main(String[] args) {
        Map<Department,Integer> map=new EnumMap<>(Department.class);

        map.put(Department.HR, 8);
        map.put(Department.DEVELOPMENT, 25);
        map.put(Department.TESTING, 12);
        map.put(Department.SALES, 10);

        System.out.println("Development Employee: " + map.get(Department.DEVELOPMENT));
        System.out.println("Total no of departments: " + map.size());
        System.out.println("Sales Exists at index: " + map.containsKey(Department.SALES));
    }
}
