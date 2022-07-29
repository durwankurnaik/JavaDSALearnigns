package com.company.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
        // Set is nothing but a normal list which does not contain duplicate values.
        // Set<Integer> set = new HashSet<>(); // The order is not maintained over here.
        // Set<Integer> set = new LinkedHashSet<>(); // The order is maintained over here.
        Set<Integer> set = new TreeSet<>(); // The order is maintained over here and the set becomes sorted.

        set.add(30);
        set.add(23);
        set.add(14);
        set.add(51);
        set.add(69);

        System.out.println(set);

        set.remove(51);

        System.out.println(set);

        System.out.println(set.size());

        set.clear();

        System.out.println(set);


        Set<Student> students = new HashSet<>();

        students.add(new Student("Durwankur", 14));
        students.add(new Student("Rohit", 41));
        students.add(new Student("Sashwat", 53));
        students.add(new Student("Shreyas", 50));
        students.add(new Student("Yadnik", 40));

        System.out.println(students);


    }
}
