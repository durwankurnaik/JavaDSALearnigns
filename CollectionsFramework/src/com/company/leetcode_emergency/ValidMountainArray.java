package com.company.leetcode_emergency;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};

        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        int peak = findPeak(arr);

        if (peak == 0 || peak == -1) {
            return false;
        }

        for (int i = arr.length - 1; i > peak; i--) {
            if (arr[i] == arr[i-1] || arr[i] > arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static int findPeak(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                return -1;
            }
            if (arr[i] > arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
}
