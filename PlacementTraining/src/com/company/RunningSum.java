package com.company;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int i = 0, count = 0;

        while (i < nums.length) {
            if (count <= i) {
                sum[i] += nums[count];
                count++;
            } else {
                i++;
                count = 0;
            }
        }
        return sum;
    }
}