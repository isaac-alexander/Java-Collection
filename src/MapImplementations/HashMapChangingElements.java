package MapImplementations;
// We can change a value in a HashMap by using the put() method with the same key, which replaces the old value with the new one.

import java.io.*;
import java.util.*;

public class HashMapChangingElements {

    static void main(String[] args) {

        // Initialization of a HashMap
        HashMap<Integer, String> hm
                = new HashMap<Integer, String>();

        // Change Value using put method
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map " + hm);
    }
}
// Output
//Initial Map {1=Geeks, 2=Geeks, 3=Geeks}
//Updated Map {1=Geeks, 2=For, 3=Geeks}
