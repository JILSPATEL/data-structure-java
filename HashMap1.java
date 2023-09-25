package practice;

import java.util.*;

public class HashMap1 {

    public static void main(String args[]) {
        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        // Searching
        if (map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China")); // Key exists
        System.out.println(map.get("Indonesia")); // Key doesn't exist

        // Iteration (1)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // Removing
        map.remove("China");
        System.out.println(map);
    }
}
