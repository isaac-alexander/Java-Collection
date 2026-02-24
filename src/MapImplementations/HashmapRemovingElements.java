package MapImplementations;
// To remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it is present in the map.

import java.io.*;
import java.util.*;
public class HashmapRemovingElements {

        public static void main(String args[])
        {
            // Initialization of a HashMap
            Map<Integer, String> hm
                    = new HashMap<Integer, String>();

            // Add elements using put method
            hm.put(1, "Geeks");
            hm.put(2, "For");
            hm.put(3, "Geeks");
            hm.put(4, "For");

            // Initial HashMap
            System.out.println("Mappings of HashMap are : "
                    + hm);

            // remove element with a key
            // using remove method
            hm.remove(4);

            // Final HashMap
            System.out.println("Mappings after removal are : "
                    + hm);
        }
    }
