package MapImplementations;
// There are multiple ways to iterate through the Map. The most famous way is to use a for-each loop and get the keys. The value of the key is found by using the getValue() method.

import java.util.*;

public class TreeMapIteratingElements {

    static void main(String[] args) {

        // Initialization of TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Inserting elements
        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            int k = e.getKey();
            String v = e.getValue();

            System.out.println(k + " : " + v);
        }
    }
}
// Output
//1 : Geeks
//2 : For
//3 : Geeks
