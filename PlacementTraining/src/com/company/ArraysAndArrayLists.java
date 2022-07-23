package com.company;

import java.util.Arrays;

public class ArraysAndArrayLists {
    public static void main(String[] args) {
//        int[] nums = {3, 6, 7, 10, 13, 14, 15, 19, 23, 30};
//        int target = 17;
//
//        System.out.println(findFloor(nums, target));

//        System.out.println(Arrays.toString(nums));

//        char[] arr = {'a', 'd', 'i', 'k', 'z'};
//        char target = 'z';
//
//        System.out.println(returnLetter(arr, target));

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(targetInRange(nums, target)));
    }

    public static int findCeiling(int[] nums, int target) {
        // s, m and e starts for start, mid and end
        int s = 0;
        int e = nums.length - 1;

        while(s <= e) {
            int m = s + (e - s) / 2;

            if (target < nums[m]) {
                e = m - 1;
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                return target;
            }
        }
        return nums[s]; // because the start counter will be the next greatest number from the target
    }

    public static int findFloor(int[] nums, int target) {
        // s, m and e starts for start, mid and end
        int s = 0;
        int e = nums.length - 1;

        while(s <= e) {
            int m = s + (e - s) / 2;

            if (target < nums[m]) {
                e = m - 1;
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                return target;
            }
        }
        return nums[e];
    }

    public static char returnLetter(char[] nums, char target) {
        // s, m and e starts for start, mid and end
        int s = 0;
        int e = nums.length - 1;

        while(s <= e) {
            int m = s + (e - s) / 2;

            if (target < nums[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return nums[s % nums.length];
    }

    public static int[] targetInRange(int[] arr, int target) {
        int start = indexFinder(arr, target, true);
        int end = indexFinder(arr, target, false);

        return new int[]{start, end};
    }

     // Returns the index value of the target
    public static int indexFinder(int[] arr, int target, boolean findStartIndex) {
        int s = 0, e = arr.length, ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                ans = m;
                if (findStartIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}
