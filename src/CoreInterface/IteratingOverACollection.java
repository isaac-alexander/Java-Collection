package CoreInterface;

import java.util.*;

public class IteratingOverACollection {
    static void main(String[] args) {
        Collection<String> l = new LinkedList<>();
        l.add("Geeks");
        l.add("for");
        l.add("Geeks");

        System.out.println("The list is: " + l);

        Iterator<String> it = l.iterator();
        System.out.print("Iterator values: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}