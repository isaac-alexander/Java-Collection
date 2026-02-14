package CoreInterface;

// Use the put() method to add elements to a Map. In HashMap, insertion order isn’t preserved, each element is stored based on its hash for faster access.

import java.util.*;

public class MapInterfaceAddingElements {

    static void main(String[] args) {

        // Default initialization of a Map using generics
        Map<Integer, String> hm1 = new HashMap<>();

        // Initialization of a Map (redundant type on right side unnecessary)
        Map<Integer, String> hm2 = new HashMap<>();

        // Inserting elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        // Inserting elements — no need to use new Integer()
        hm2.put(1, "Geeks");
        hm2.put(2, "For");
        hm2.put(3, "Geeks");

        System.out.println(hm1);
        System.out.println(hm2);
    }
}
