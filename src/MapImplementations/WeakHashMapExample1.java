package MapImplementations;
// Java Program to Illustrate WeakHashMap class
// Via close(), containsValue(), containsKey()
// and isEmpty() method

// Importing required classes

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample1 {
    public static void main(String[] arg)
    {

        // Creating an empty WeakHashMap
        // of Number and string type
        Map<Number, String> weak
                = new WeakHashMap<Number, String>();

        // Inserting custom elements
        // using put() method
        weak.put(1, "geeks");
        weak.put(2, "for");
        weak.put(3, "geeks");

        // Printing and alongside checking weak map
        System.out.println("our weak map: " + weak);

        // Checking if "for" exist
        if (weak.containsValue("for"))
            System.out.println("for exist");

        // Checking if 1 exist as a key in Map
        if (weak.containsKey(1))
            System.out.println("1 exist");

        // Removing all data
        // using clear() method
        weak.clear();

        // Checking whether the Map is empty or not
        // using isEmpty() method
        if (weak.isEmpty())

            // Display message for better readability
            System.out.println("empty map: " + weak);
    }
}
// Output
//our weak map: {3=geeks, 2=for, 1=geeks}
//for exist
//1 exist
//empty map: {}
