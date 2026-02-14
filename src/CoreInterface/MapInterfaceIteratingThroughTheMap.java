package CoreInterface;

// There are multiple ways to iterate through the Map. The most famous way is to use a for-each loop and get the keys. The value of the key is found by using the getValue() method.

import java.util.*;

public class MapInterfaceIteratingThroughTheMap {

    static void main(String[] args) {

        // Initialization of a Map using Generics
        Map<Integer, String> hm1
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(Integer.valueOf(1), "Geeks");
        hm1.put(Integer.valueOf(2), "For");
        hm1.put(Integer.valueOf(3), "Geeks");

        for (Map.Entry mapElement : hm1.entrySet()) {
            int key = (int) mapElement.getKey();

            // Finding the value
            String value = (String) mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
