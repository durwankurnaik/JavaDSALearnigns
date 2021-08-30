package com.company;
// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        System.out.println(splitArray(arr, 2));
    }

    static int splitArray(int[] arr, int m) {
        int start = 0, end = 0;

        for (int j : arr) {
            start = Math.max(start, j);
            end += j;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0, times = 1;

            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    times++;
                } else {
                    sum += num;
                }
            }
            if (times <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
