package CoreInterface;

// To remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it is present in the map.

import java.util.*;

public class MapInterfaceRemovingElements {

    static void main(String[] args) {

        // Initialization of a Map using Generics
        Map<Integer, String> hm1
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(Integer.valueOf(1), "Geeks");
        hm1.put(Integer.valueOf(2), "For");
        hm1.put(Integer.valueOf(3), "Geeks");
        hm1.put(Integer.valueOf(4), "For");

        System.out.println(hm1);

        hm1.remove(Integer.valueOf(4));

        System.out.println(hm1);
    }
}
