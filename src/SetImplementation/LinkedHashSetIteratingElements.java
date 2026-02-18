package SetImplementation;
// Iterate through the elements of  LinkedHashSet usingthe iterator() method. The most famous one is to use the enhanced for loop.

import java.io.*;
import java.util.*;

public class LinkedHashSetIteratingElements {

    static void main(String[] args) {

        Set<String> lh = new LinkedHashSet<String>();

        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");
        lh.add("A");
        lh.add("B");
        lh.add("Z");

        Iterator itr = lh.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        System.out.println();

        for (String s : lh)
            System.out.print(s + ", ");
        System.out.println();
    }
}
