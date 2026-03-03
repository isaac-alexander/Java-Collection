package UtilityAndSupportingClasses;
// Objects of Classes implementing Collection interface can be iterated using for-each loop, Collection interface extends Iterable interface.

// Java Program to demonstrate iterate
// an iterable using for-each loop

import java.io.*;
import java.util.*;

public class IterateUsingEnhancedForLoop {
    public static void main (String[] args) {

        // create a list
        List<String> list = new ArrayList<String>();

        // add elements
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // Iterate through the list
        for( String element : list ){
            System.out.println( element );
        }
    }
}
// Output
//Geeks
//for
//Geeks
