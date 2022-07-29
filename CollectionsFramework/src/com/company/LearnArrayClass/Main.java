package com.company.LearnArrayClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {2, 5, 6, 10, 11, 20, 60, 69, 100};
        int[] nums = {4, 2, 59, 43, 10, 100, 51, 1, -54, 0, 33, 99};

//        int index = Arrays.binarySearch(nums, 69);

//        System.out.println("Index of element 69 in the array is " + index);

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

    }
}
