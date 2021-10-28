package com.company;
// https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 2;

        System.out.println(removeElement(arr, val));
    }

    static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1]; // Deletes the instances of val
                }
                count++; // Counts the number of times val occurred in the  array
                nums[nums.length-1] = Integer.MIN_VALUE; // Sets the last element to be the lowest value an integer can hold
            } else {
                i++;
            }
        }
        return nums.length - count;
    }
}
