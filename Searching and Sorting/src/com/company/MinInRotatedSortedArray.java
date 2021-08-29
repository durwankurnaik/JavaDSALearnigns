package com.company;
// This is a leetcode hard question. Solved on the basis of peakElementInRotatedArray intuition.
public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 0};

        System.out.println(searchMin(arr));
    }

    static int searchMin(int[] arr) {
        int min = findMin(arr);
        if (min != -1) {
            return min;
        }
        return arr[0];
    }
    static int findMin(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
