package CoreInterface;

// To add elements to a Set in Java, use the add() method.

import java.util.*;

public class SetInterfaceAddingElements {

    public static void main(String[] args)
    {
        Set<String> s = new HashSet<String>();

        s.add("B");
        s.add("B");
        s.add("C");
        s.add("A");

        System.out.println(s);
    }
}
