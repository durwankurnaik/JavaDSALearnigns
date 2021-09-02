package com.company;

// Given that the array is a sorted array.
public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 8, 9, 10};
        int target = 5;

        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (target < arr[start]) {
                return -1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return arr[end];
    }
}
