package com.company;

public class Timepass {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};

        System.out.println(isSum(arr, 18));
    }

    public static boolean isSum(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == val) {
                    return true;
                }
            }
        }
        return false;
    }
}
