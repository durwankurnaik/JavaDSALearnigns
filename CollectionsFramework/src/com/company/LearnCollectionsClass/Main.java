package com.company.LearnCollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(32);
//        list.add(43);
//        list.add(65);
//        list.add(13);
//        list.add(43);
//        list.add(88);
//
//        System.out.println(Collections.max(list));
//        System.out.println(Collections.frequency(list, 69));
//
//        System.out.println(list);
//
//        Collections.sort(list);
//
//        System.out.println(list);
//
//        Collections.reverse(list);
//
//        System.out.println(list);

        List<Student> students = new ArrayList<>();

        students.add(new Student("Durwankur", 14));
        students.add(new Student("Aniket", 23));
        students.add(new Student("Rahul", 46));
        students.add(new Student("Harshit", 6));
        students.add(new Student("Raghavi", 68));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

    }
}
