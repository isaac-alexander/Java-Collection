package ListImplementations;

// To add the elements to the Vector, we use the add() method. This method is overloaded to perform multiple operations based on different parameters. They are listed below as follows:
//
//add(Object): This method is used to add an element at the end of the Vector.
//add(int index, Object): This method is used to add an element at a specific index in the Vector.



import java.io.*;
import java.util.*;

public class VectorAddingElements {

    static void main(String[] arg) {
        // Creating a default vector
        Vector v1 = new Vector();

        // Adding custom elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        System.out.println("Vector v1 is " + v1);

        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);

        System.out.println("Vector v2 is " + v2);
    }
}
