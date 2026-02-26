package MapImplementations;
// We can use the put() method to insert elements to a TreeMap. However, the insertion order is not retained in the TreeMap. Internally, for every element, the keys are compared and sorted in ascending order.

import java.util.*;

public class TreeMapAddingElements {

    static void main(String[] args) {

        // Initialization of TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Inserting the elements in TreeMap using put()
        // method
        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        System.out.println("TreeMap with raw type: " + tm);

        // Initialization of TreeMap with Generics
        TreeMap<Integer, String> tm1 = new TreeMap<>();

        // Inserting elements into tm1
        tm1.put(3, "Language");
        tm1.put(2, "Programming");
        tm1.put(1, "Java");

        System.out.println("TreeMap with generics: " + tm1);
    }
}
// Output
//TreeMap with raw type: {1=Geeks, 2=For, 3=Geeks}
//TreeMap with generics: {1=Java, 2=Programming, 3=Language}
