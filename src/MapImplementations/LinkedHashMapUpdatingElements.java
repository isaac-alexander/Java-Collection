package MapImplementations;
// To update an element in a LinkedHashMap, use the put() method again with the same key and a new value , it replaces the old value while keeping the insertion order.

import java.util.*;

public class LinkedHashMapUpdatingElements {

    static void main(String[] args) {

        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> lhm
                = new LinkedHashMap<Integer, String>();

        // Inserting mappings into Map
        // using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "Geeks");
        lhm.put(1, "Geeks");

        // Printing mappings to the console
        System.out.println("" + lhm);

        // Updating the value with key 2
        lhm.put(2, "For");

        // Printing the updated Map
        System.out.println("Updated Map: " + lhm);
    }
}
// Output
//{3=Geeks, 2=Geeks, 1=Geeks}
//Updated Map: {3=Geeks, 2=For, 1=Geeks}
