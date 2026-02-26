package MapImplementations;
// This constructor is used to build an empty TreeMap that will be sorted by using the natural order of its keys.
//
//Syntax:
//
//TreeMap<K, V> map = new TreeMap<>();

import java.util.TreeMap;

public class TreeMapConstructor {

    // To show TreeMap constructor
    static void Constructor() {

        // Creating an empty TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Mapping string values to int keys using put()
        // method
        tm.put(10, "Geeks");
        tm.put(15, "For");
        tm.put(20, "Geeks");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }

    static void main(String[] args) {

        System.out.println("TreeMap using TreeMap() constructor");

        // Calling constructor
        Constructor();
    }
}
// Output
// TreeMap using TreeMap() constructor
// TreeMap: {10=Geeks, 15=For, 20=Geeks}
