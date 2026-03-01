package MapImplementations;
// In order to remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it is present in the map.

// Removing Elements in Hashtable
import java.io.*;
import java.util.*;

public class HashtableRemovingElements {

    static void main(String[] args) {
        // Initialization of a Hashtable
        Map<Integer, String> ht
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put method
        ht.put(1, "Geeks");
        ht.put(2, "For");
        ht.put(3, "Geeks");
        ht.put(4, "For");

        // Initial HashMap
        System.out.println("Initial map : " + ht);

        // Remove the map entry with key 4
        ht.remove(4);

        // Final Hashtable
        System.out.println("Updated map : " + ht);
    }
}
// Output
//Initial map : {4=For, 3=Geeks, 2=For, 1=Geeks}
//Updated map : {3=Geeks, 2=For, 1=Geeks}