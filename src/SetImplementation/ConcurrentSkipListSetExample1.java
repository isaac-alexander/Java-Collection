package SetImplementation;
// This example demonstrates how to sue ConcurrentSkipListSet for adding, copying and iterating over elements in thread-sade, sorted set.

// Java Program to demonstrates basic operations on
// ConcurrentSkipListSet
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample1 {

    static void main(String[] args) {
        // Initializing the set using
        // ConcurrentSkipListSet()
        ConcurrentSkipListSet<Integer> s
                = new ConcurrentSkipListSet<Integer>();

        // Adding elements to this set
        s.add(78);
        s.add(64);
        s.add(12);
        s.add(45);
        s.add(8);

        // Printing the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet: " + s);

        // Initializing the set using
        // ConcurrentSkipListSet(Collection)
        ConcurrentSkipListSet<Integer> s1
                = new ConcurrentSkipListSet<Integer>(s);

        // Printing the ConcurrentSkipListSet1
        System.out.println("ConcurrentSkipListSet1: " + s1);

        // Initializing the set using
        // ConcurrentSkipListSet()
        ConcurrentSkipListSet<String> s2
                = new ConcurrentSkipListSet<>();

        // Adding elements to this set
        s2.add("Java");
        s2.add("C++");
        s2.add("Python");
        s2.add("Java");

        // creating an iterator
        Iterator<String> i = s2.iterator();

        System.out.print("ProgrammingSet: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}

// Output
//ConcurrentSkipListSet: [8, 12, 45, 64, 78]
//ConcurrentSkipListSet1: [8, 12, 45, 64, 78]
//ProgrammingSet: C++ Java Python