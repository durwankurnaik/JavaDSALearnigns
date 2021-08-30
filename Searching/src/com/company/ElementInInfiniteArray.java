package com.company;
// Basically its half working and half not.
public class ElementInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {-69, -24, -21, -15, -9, -5, 0, 1, 3, 5, 7, 8, 9, 12, 24, 34, 35, 37, 39, 40, 41, 43, 45, 56, 69, 99};
        int target = 34;

        System.out.println(ans(nums, target));
    }
    static int ans(int[] arr, int target) {
        int start = 0, end = 1;

        while (target > arr[end]) {
            int tempNewStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempNewStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // If not found, returning -1.
        return -1;
    }
}
