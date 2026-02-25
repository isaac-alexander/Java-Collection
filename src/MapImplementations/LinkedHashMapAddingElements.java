package MapImplementations;
// We can add elements to a LinkedHashMap using the put() method, which retains the insertion order unlike HashMap.

import java.util.*;

public class LinkedHashMapAddingElements {

    static void main(String[] args) {

        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> lhm
                = new LinkedHashMap<Integer, String>();

        // Add mappings to Map
        // using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "For");
        lhm.put(1, "Geeks");

        // Printing mappings to the console
        System.out.println(""
                + lhm);
    }
}
// Output
//{3=Geeks, 2=For, 1=Geeks}
