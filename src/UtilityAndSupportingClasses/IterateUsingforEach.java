package UtilityAndSupportingClasses;
// The forEach() method takes the Lambda Expression as a parameter. This Lambda Expression is called for each element of the collection. In the below example, for each element of the list, the function prints the element to the console.

// Java Program to demonstrate iterate
// an Iterable using forEach method

import java.io.*;
import java.util.*;

public class IterateUsingforEach {
    public static void main(String[] args)
    {
        // create a list
        List<String> list = new ArrayList<>();

        // add elements to the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // Iterate through the list
        list.forEach(
                (element) -> { System.out.println(element); });
    }
}
// Output
//Geeks
//for
//Geeks
