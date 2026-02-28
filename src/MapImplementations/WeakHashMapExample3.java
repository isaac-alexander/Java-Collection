package MapImplementations;
// Java code remove(), putAll()
// get() and size() method

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample3 {
    static void main(String[] arg) {
        Map<Number, String> weak
                = new WeakHashMap<Number, String>();
        weak.put(1, "geeks");
        weak.put(2, "for");
        weak.put(3, "geeks");

        Map<Number, String> weak1
                = new WeakHashMap<Number, String>();
        weak1.putAll(weak);

        // Getting value of key 2
        System.out.println(weak1.get(2));

        // Printing the size of map
        // using size() method
        System.out.println("Size of map is: "
                + weak1.size());

        // Removing second element
        // using standard remove() method
        weak1.remove(2);

        // Printing the size after removing key and value
        // pair
        System.out.println("Size after removing: "
                + weak1.size());
    }
}
// Output
//for
//Size of map is: 3
//Size after removing: 2
