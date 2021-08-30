package com.company;
// This is the leetcode hard question.
// https://leetcode.com/problems/find-in-mountain-array/

public class ElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 69, 4, 1};
        int target = 69;
        int targetIndexAt = search(arr, target);

        System.out.println(targetIndexAt);
    }

    // This will return the index at which target was found two functions.
    // orderAgnosticBinarySearch() and peakIndexAt() are used.
    // if not found then the answer would be -1 because orderAgnosticBinarySearch() will return it.
    static int search(int[] arr, int target) {
        int peak = peakIndexAt(arr);

        int firstHalf = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    // This will do the ascending binary search, if not found in that, then it will do the descending binary search.
    // If the target is not found in any one the cases, then it will return -1.
    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // This method will find the peak index of the bi-tonic array and return it.
    static int peakIndexAt(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
