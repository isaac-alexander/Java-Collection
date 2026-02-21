package SetImplementation;
//  This example demonstrates how to use ConcurrentSkipListSet to add elements, find the highest element, remove the first element, check for membership, and get the size of the set.

// Java program to demonstrate the working
// of add(), last(), pollFirst(), size()
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample2 {

    static void main(String[] args) {
        // Initializing the set using
        // ConcurrentSkipListSet()
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();

        // Adding elements to this set
        // using add() method
        set.add(78);
        set.add(64);
        set.add(12);
        set.add(45);
        set.add(8);

        // Printing the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet: " + set);

        // Printing the highest element of the set
        // using last() method
        System.out.println("The highest element of the set: " + set.last());

        // Retrieving and removing first element of the set
        System.out.println("The first element of the set: " + set.pollFirst());

        // Checks if 9 is present in the set
        // using contains() method
        if (set.contains(9)) System.out.println("9 is present in the set.");
        else System.out.println("9 is not present in the set.");

        // Printing the size of the set
        // using size() method
        System.out.println("Number of elements in the set = " + set.size());
    }
}

// Output
//ConcurrentSkipListSet: [8, 12, 45, 64, 78]
//The highest element of the set: 78
//The first element of the set: 8
//9 is not present in the set.
//Number of elements in the set = 4