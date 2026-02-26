package MapImplementations;
// To change the element in a TreeMap, simply use the put() method again with the same key and the new value.

import java.util.*;

public class TreeMapChangingElements {

    static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        // Inserting the elements in Map
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");

        System.out.println(tm);

        tm.put(2, "For");

        System.out.println(tm);
    }
}
// Output
//{1=Geeks, 2=Geeks, 3=Geeks}
//{1=Geeks, 2=For, 3=Geeks}
