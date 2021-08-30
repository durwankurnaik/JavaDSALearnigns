package com.company;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
// Solved with a little bit of hint.

public class PeakNumberInMountainArray {
    public static void main(String[] args) {
        int[] arr = {23, 43, 56, 66, 69, 154, 251, 349, 40, 39, 31, 25, 0};
        int target = 251;

        System.out.println(targetIndexFinder(arr, target));
    }

    // This function will find the target index from the given mountain array.
    static int targetIndexFinder(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        // Main brain of the program lies over here.
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}