package CoreInterface;

// To update a value, use the put() method with the same key. The new value replaces the old one for that key.

import java.util.*;

public class MapInterfaceChangingElement {

    static void main(String[] args) {

        // Initialization of a Map using Generics
        Map<Integer, String> hm1
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(Integer.valueOf(1), "Geeks");
        hm1.put(Integer.valueOf(2), "Geeks");
        hm1.put(Integer.valueOf(3), "Geeks");

        System.out.println("Initial Map: " + hm1);

        hm1.put(Integer.valueOf(2), "For");

        System.out.println("Updated Map: " + hm1);
    }
}
