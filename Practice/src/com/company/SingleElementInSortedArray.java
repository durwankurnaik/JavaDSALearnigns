package com.company;

// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {};

        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (i < nums.length - 1) {
                if (nums[i] == nums[i+1]) {
                    i += 2;
                } else {
                    return nums[i];
                }
            } else {
                return nums[i];
            }

        }
        return -1;
    }
}
