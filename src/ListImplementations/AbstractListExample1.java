package ListImplementations;
// AbstractList is an abstract class, so it should be assigned an instance of its subclasses such as ArrayList, LinkedList, or Vector.

import java.util.*;

public class AbstractListExample1 {

    static void main(String[] args) {

        // Creating an empty AbstractList
        AbstractList<String> list = new ArrayList<String>();

        // Use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        // Displaying the AbstractList
        System.out.println("AbstractList:" + list);
    }
}
