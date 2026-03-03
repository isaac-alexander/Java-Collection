package UtilityAndSupportingClasses;

// Java Program to demonstrate iterate
// an Iterable using an Iterator

import java.io.*;
import java.util.*;

public class IterateUsingIterator {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
// Output
//Geeks
//for
//Geeks
