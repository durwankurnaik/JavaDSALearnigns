package com.company.CollectionsLearnings;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LearnArrayList {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 7, 1, 99, 69, 99, 54, 21, 7, 1, 99, 69, 54, 45, -87, 77, 69, 69, 51, 100};
        List<Integer> numsList = new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        numsList = numsList.stream().distinct().collect(Collectors.toList());
//        System.out.println(numsList);

        String something = "100110101";
        System.out.println(something.replace("0", ""));
    }
}
