package UtilityAndSupportingClasses;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ComparatorExample1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(2, "Rahul"));
        list.add(new Student(1, "Amit"));

        Collections.sort(list, (s1, s2) -> s1.id - s2.id);

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}

//Output
//1 Amit
//2 Rahul
