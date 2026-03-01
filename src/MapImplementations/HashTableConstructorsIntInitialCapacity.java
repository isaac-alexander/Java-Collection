package MapImplementations;
//  Hashtable(int initialCapacity)
//This creates a hash table that has an initial size specified by initialCapacity and the default load factor is 0.75.
//
//Hashtable<K, V> ht = new Hashtable<K, V>(int initialCapacity);

// Using Hashtable(int initialCapacity)
import java.io.*;
import java.util.*;

public class HashTableConstructorsIntInitialCapacity {
    static void main(String[] args) {
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1
                = new Hashtable<>(4);

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>(2);

        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}
// Output
//Mappings of ht1 : {3=three, 2=two, 1=one}
//Mappings of ht2 : {4=four, 6=six, 5=five}
