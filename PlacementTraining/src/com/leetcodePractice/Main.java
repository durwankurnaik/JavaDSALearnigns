package com.leetcodePractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.putIfAbsent(3, 1);
        map.put(4, 0);
        map.put(5, 0);
        map.put(6, 0);

        System.out.println(map);

        System.out.println("Something");
    }
}
