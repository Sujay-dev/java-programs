package Sets.HashSet;

import java.util.HashSet;

public class TokenId {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();

        set.add("T101");
        set.add("T102");
        set.add("T103");
        set.add("T104");
        set.add("T101");
        set.add("T102");
        set.add("T105");

        System.out.println("Unique Tokens: " + set);
        System.out.println("Active Unique Tokens: " + set.size());
        System.out.println("ID 104 Exits: " + set.contains("T104"));
        set.remove("T103");
        System.out.println(set);

    }
}
