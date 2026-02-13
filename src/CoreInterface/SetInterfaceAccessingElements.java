package CoreInterface;
// After adding the elements, if we wish to access the elements, we can use inbuilt methods like contains().

import java.util.*;

public class SetInterfaceAccessingElements {
    static void main(String[] args) {
        Set<String> h = new HashSet<String>();

        h.add("A");
        h.add("B");
        h.add("C");
        h.add("A");

        System.out.println("Set is " + h);

        String s = "D";

        System.out.println("Contains " + s + " " + h.contains(s));
    }
}
