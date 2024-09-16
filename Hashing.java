import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 40);
        map.put("China", 140);

        // System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        // Searching
        if (map.containsKey("indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in map");
        }
        System.out.println(map.get("China")); // key exists
        System.out.println(map.get("Australia")); // key doesn't exit

        // Iteration(1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}