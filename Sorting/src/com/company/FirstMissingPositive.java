package com.company;
// Leetcode Hard.
// https://leetcode.com/problems/first-missing-positive/
// Half solved by me and remaining half was solved after kunals answer.

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};

        System.out.println((missing(arr)));
    }

    static int missing(int[] nums) {
        // Sorting the array using cyclic sort.
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Iterating through the sorted array, to find the missing number.
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // Returning the missing element.
            }
        }
        return nums.length + 1;
    }
}
