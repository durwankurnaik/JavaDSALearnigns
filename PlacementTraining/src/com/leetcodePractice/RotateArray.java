// https://leetcode.com/problems/rotate-array

package com.leetcodePractice;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rot = 3;

        rotate(arr, rot);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] nums, int start, int end){
        int swap;
        while (start < end){
            swap = nums[start];
            nums[start] = nums[end];
            nums[end] = swap;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if (k == 0) {
            return;
        }

        reverse(nums,0,len - k - 1);
        reverse(nums,len - k,len - 1);
        reverse(nums,0,len - 1);
    }
}
