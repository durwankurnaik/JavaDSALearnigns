package com.company;
// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 2};

        System.out.println(Arrays.toString(mismatch(arr)));
    }

    static int[] mismatch(int[] nums) {
        int[] ans = new int[2];

        // Sorting the array using cyclic sort.
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Iterating through the sorted array, to find the duplicated number.
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i]; // Adding the duplicate element to the answer array from the set.
                ans[1] = i + 1; // Adding the missing element to the answer array from the set.
            }
        }
        return ans;
    }
}
