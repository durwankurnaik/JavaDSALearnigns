package com.leetcodePractice;

import java.util.Arrays;

public class MiddleIndexInArray {
    public static void main(String[] args) {
        int[] nums = {2, 5};

        System.out.println(findMiddleIndex(nums));
    }

    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0, sumUptoI = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (2 * sumUptoI == (totalSum - nums[i])) {
                return i;
            }
            sumUptoI += nums[i];
        }
        return -1;
    }
}
