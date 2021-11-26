package com.company.Part7.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
            list2.add(i+1);
            list3.add(i+1);
        }
        System.out.println(list + " is a Arraylist");
        System.out.println(list2 + " is a Linked list");
        System.out.println(list3 + " is a Vector");
    }
}
