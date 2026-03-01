package MapImplementations;
// After adding the elements if we wish to change the element, it can be done by again adding the element with the put() method. Since the elements in the hashtable are indexed using the keys, the value of the key can be changed by simply inserting the updated value for the key for which we wish to change.

// Updating Elements in Hashtable
import java.io.*;
import java.util.*;

public class HashtableChangingElements {

    static void main(String[] args) {

        // Initialization of a Hashtable
        Hashtable<Integer, String> ht
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        ht.put(1, "Geeks");
        ht.put(2, "Geeks");
        ht.put(3, "Geeks");

        // print initial map to the console
        System.out.println("Initial Map " + ht);

        // Update the value at key 2
        ht.put(2, "For");

        // print the updated map
        System.out.println("Updated Map " + ht);
    }
}
// Output
//Initial Map {3=Geeks, 2=Geeks, 1=Geeks}
//Updated Map {3=Geeks, 2=For, 1=Geeks}