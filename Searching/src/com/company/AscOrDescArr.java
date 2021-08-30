package com.company;

// The program basically assumes the array is sorted, either ascending or descending.
// It checks if it is ascending or not and does the appropriate calculations according to that.
// Finally, it does the binary search on the given array and prints the index to the screen.
// Problem with this is its not necessary to do this many functions in the program.

public class AscOrDescArr {
    public static void main(String[] args) {
        int[] arr = {-23, -23, -23, -11, -5, -1, 0, 23, 33, 43, 56, 69, 71, 87, 99}; // Ascending array
//        int[] arr = {43, 41, 39, 35, 33, 25, 21, 18, 9, 5, 1, 0, -12, -69}; // Descending array

        int target = 43;
        int ans;

        // Finding whether the array is Ascending or Descending ans taking proper action according to it.
        if (isAsc(arr)) ans = ascBinSearch(arr, target);
        else ans = descBinSearch(arr, target);

        System.out.println(ans);
    }

    // Checks if the array is ascending. Returns true if the array is ascending else false.
    static boolean isAsc(int[] arr) {
        return arr[0] <= arr[arr.length - 1];
    }

    // Doing binary search for the ascending array.
    static int ascBinSearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }

        // If not found, returning -1.
        return -1;
    }

    // Doing binary search for the descending array.
    static int descBinSearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) start = mid + 1;
            else if (target > arr[mid]) end = mid - 1;
            else return mid;
        }
        // If not found, returning -1.
        return -1;
    }
}
