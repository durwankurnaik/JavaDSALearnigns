package com.company;

// Given that the array is a sorted array.
public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {5, 9, 17, 20, 21, 36, 69};
        int target = 70;

        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (target > arr[end]) {
                return -1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid;
            }
        }

        return arr[end];
    }
}
