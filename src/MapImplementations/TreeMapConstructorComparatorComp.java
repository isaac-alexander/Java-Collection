package MapImplementations;
// This constructor is used to build an empty TreeMap object in which the elements will need an external specification of the sorting order.
//
//Syntax:
//
//TreeMap<K, V> map = new TreeMap<>(Comparator<? super K> comparator);

import java.util.Comparator;
import java.util.TreeMap;

class Student {

    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {

        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {

        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

// Comparator class
class SortByRoll implements Comparator<Student> {

    public int compare(Student a, Student b) {

        // Compare based on roll number
        return a.rollno - b.rollno;
    }
}

public class TreeMapConstructorComparatorComp {

    static void main(String[] args) {

        // Create a TreeMap using a Comparator
        TreeMap<Student, Integer> tm
                = new TreeMap<>(new SortByRoll());

        tm.put(new Student(111, "Geek1", "New York"), 1);
        tm.put(new Student(131, "Geek2", "London"), 2);
        tm.put(new Student(121, "Geek3", "Paris"), 3);

        System.out.println("TreeMap sorted by roll number: "
                + tm);
    }
}
// Output
//TreeMap sorted by roll number: {111 Geek1 New York=1, 121 Geek3 Paris=3, 131 Geek2 London=2}