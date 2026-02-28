package MapImplementations;
// We can use the Iterator interface to traverse over any structure of the Collection Framework. Since Iterators work with one type of data we use Entry< ? , ? > to resolve the two separate types into a compatible format. Then using the next() method we print the elements of the IdentityHashMap.

import java.util.IdentityHashMap;
import java.util.Iterator;

public class IdentityHashmapIteratingElements {

    static void main(String[] args) {

        // Creating an empty IdentityHashMap
        IdentityHashMap<Integer, String> identity_hash
                = new IdentityHashMap<Integer, String>();

        // Mapping string values to int keys
        identity_hash.put(10, "Geeks");
        identity_hash.put(15, "4");
        identity_hash.put(20, "Geeks");
        identity_hash.put(25, "Welcomes");
        identity_hash.put(30, "You");

        // Displaying the IdentityHashMap
        System.out.println("Initial Mappings are: "
                + identity_hash);

        // Create an Iterator over the
        // IdentityHashMap
        Iterator<IdentityHashMap.Entry<Integer, String>>
                itr = identity_hash.entrySet().iterator();

        // The hasNext() method is used to check if there is
        // a next element The next() method is used to
        // retrieve the next element
        while (itr.hasNext()) {
            IdentityHashMap.Entry<Integer, String> entry
                    = itr.next();
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
        }
    }
}
// Output
//Initial Mappings are: {30=You, 10=Geeks, 15=4, 25=Welcomes, 20=Geeks}
//Key = 30, Value = You
//Key = 10, Value = Geeks
//Key = 15, Value = 4
//Key = 25, Value = Welcomes
//Key = 20, Value = Geeks
