package MapImplementations;
// To insert or add mapping into an IdentityHashMap, we have put() and putAll() methods. put() can insert a specific key and the value it is mapping, into a particular map. If an existing key is passed then the previous value gets replaced by the new value. putAll() copies all of the elements i.e., the mappings, from one map into another.

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapAddingElements {

    static void main(String[] args) {
        // Creating an empty IdentityHashMap
        Map<Integer, String> identity_hash
                = new IdentityHashMap<Integer, String>();

        // Mapping string values to int keys
        // using put() method
        identity_hash.put(10, "Geeks");
        identity_hash.put(15, "4");
        identity_hash.put(20, "Geeks");
        identity_hash.put(25, "Welcomes");
        identity_hash.put(30, "You");

        // Displaying the IdentityHashMap
        System.out.println("Initial Mappings are: "
                + identity_hash);

        // Inserting existing key along with new value
        // previous value gets returned and stored in
        // returned_value
        String returned_value
                = identity_hash.put(20, "All");

        // Verifying the returned value
        System.out.println("Returned value is: "
                + returned_value);

        // Displaying the new map
        System.out.println("New map is: " + identity_hash);

        // Creating a new Identityhash map and copying
        Map<Integer, String> new_Identityhash_map
                = new IdentityHashMap<Integer, String>();
        new_Identityhash_map.putAll(identity_hash);

        // Displaying the final IdentityHashMap
        System.out.println("The new map: "
                + new_Identityhash_map);
    }
}
// Output
//Initial Mappings are: {30=You, 10=Geeks, 15=4, 25=Welcomes, 20=Geeks}
//Returned value is: Geeks
//New map is: {30=You, 10=Geeks, 15=4, 25=Welcomes, 20=All}
//The new map: {30=You, 10=Geeks, 15=4, 25=Welcomes, 20=All}
