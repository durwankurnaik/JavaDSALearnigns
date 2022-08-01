package com.company.leetcode_emergency;

import java.util.Arrays;

public class SortParityArray2 {
    public static void main(String[] args) {
        int[] nums = {2,0,3,4,1,3};

        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        boolean previousSwapped = false;

        while (j < nums.length) {
            if ((nums[i] & 1) != (i & 1)) {
                swap(nums, i, j);
                j++;
                previousSwapped = true;
            } else {
                i++;
                if (!previousSwapped || (i == j)) {
                    j++;
                }
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
