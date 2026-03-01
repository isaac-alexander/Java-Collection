package MapImplementations;
// Hashtable(Map<? extends K,? extends V> m)
//This creates a hash table that is initialized with the elements in m.
//
//Hashtable<K, V> ht = new Hashtable<K, V>(Map m);

// Using Hashtable(Map<? extends K,? extends V> m)
import java.io.*;
import java.util.*;

public class HashTableConstructorsMapExtendsKExtendsV {
    static void main(String[] args) {
        // No need to mention the
        // Generic type twice
        Map<Integer, String> hm = new HashMap<>();

        // Inserting the Elements
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>(hm);

        // Print mappings to the console

        System.out.println("Mappings of ht2 : " + ht2);
    }
}
// Output
// Mappings of ht2 : {3=three, 2=two, 1=one}
