package com.company.Part6.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee durwankur = new Employee(55000, 21);
        Employee shruti = new Employee(60000, 21);
        Employee kaustubh = new Employee(45000, 21);
        Employee shriya = new Employee(100000, 25);
        Employee niraj = new Employee(65000, 22);

        Employee[] list = {durwankur, shruti, kaustubh, shriya, niraj};

//        if (shruti.compareTo(durwankur) > 0) {
//            System.out.println("Shruti earns more");
//        } else {
//            System.out.println("Durwankur earns more");
//        }

        Arrays.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -(int)(o1.salary - o2.salary);
            }
        });

        System.out.println(Arrays.toString(list));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list2.add(i+1);
        }

        list2.forEach((item) -> System.out.print(item * 2 + ", "));
    }
}
