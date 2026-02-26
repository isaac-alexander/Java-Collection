package MapImplementations;
// This constructor is used to initialize a TreeMap with the entries from the given map M which will be sorted by using the natural order of the keys.
//
//Syntax:
//
//TreeMap<K, V> map = new TreeMap<>(Map<? extends K, ? extends V> m);

import java.util.*;
import java.util.concurrent.*;

public class TreeMapConstructorMapM {

    // Method To illustrate constructor<Map>
    static void Constructor() {
        // Creating an empty HashMap
        TreeMap<Integer, String> m = new TreeMap<>();

        m.put(10, "Geeks");
        m.put(20, "For");
        m.put(30, "Geeks");

        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tm
                = new TreeMap<Integer, String>(
                m);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }

    static void main(String[] args) {
        System.out.println(
                "TreeMap using TreeMap(Map) Constructor");
        Constructor();
    }
}
// Output
//TreeMap using TreeMap(Map) Constructor
//TreeMap: {10=Geeks, 20=For, 30=Geeks}