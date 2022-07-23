package com.company;

import java.util.Arrays;

public class leetcode_medium {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = product(nums, i);
        }
        return ans;
    }

    public static int product(int[] nums, int index) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (index != i) {
                product *= nums[i];
            }
        }
        return product;
    }
}
