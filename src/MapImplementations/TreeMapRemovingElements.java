package MapImplementations;
// We can use the remove() method to remove element from the TreeMap.

import java.util.*;

public class TreeMapRemovingElements {

    static void main(String[] args) {

        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm = new TreeMap<>();


        // Inserting the elements using put() method
        tm.put(3, "Java");
        tm.put(2, "C++");
        tm.put(1, "Python");
        tm.put(4, "JS");

        System.out.println(tm);

        // Removing the element corresponding to key
        tm.remove(4);

        System.out.println(tm);
    }
}
// Output
//{1=Python, 2=C++, 3=Java, 4=JS}
//{1=Python, 2=C++, 3=Java}
