package com.company.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnHashMap {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>(); // Same like Hashset, order is random in here.
//        Map<String, String> map = new TreeMap<>(); // Same like TreeSet, keys are sorted in ascending order.
        Map<String, String> map = new LinkedHashMap<>(); // Same like LinkedHashSet, order is maintained over here.

        map.put("Name", "Durwankur");
        map.put("Age", "20 Years");
        map.put("Profession", "Engineering Student");
        map.put("Strength", "Optimistic Behaviour");
        map.put("Hobby", "Coding");
        map.put("Name", "Durwankur Naik"); // Here, this will override the previous value, but won't make a duplicate of it.

        System.out.println(map);

//        for (Map.Entry<String, String> e : map.entrySet()) {
////            System.out.println(e);
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
//
//        for (String key : map.keySet() /* Returns only key set array */) {
//            System.out.println(key);
//        }
//
//        for (String value : map.values() /* Returns only value set array */) {
//            System.out.println(value);
//        }
    }
}
