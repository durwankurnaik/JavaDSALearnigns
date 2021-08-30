package com.company;

public class SimpleAscOrDescArr {
    public static void main(String[] args) {
//        int[] arr = {-23, -23, -23, -11, -5, -1, 0, 23, 33, 43, 56, 69, 71, 87, 99}; // Ascending array
        int[] arr = {43, 41, 39, 35, 33, 25, 21, 18, 9, 5, 1, 0, -12, -69}; // Descending array

        int target = 43;
        int ans = indexOfAns(arr, target);
        System.out.println(ans);
    }

    // Returns the index at which the target is found, if not found, returns -1.
    static int indexOfAns(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Main brain of the program is here.
            if (arr[mid] == target) return mid; // This is the common case in both Ascending and descending.
            if (isAsc) {
                if (target > arr[mid]) start = mid + 1;
                else end = mid - 1;
            } else {
                if (target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
