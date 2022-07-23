package com.company;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2};
        int target = 2;

        System.out.println(rotatedBS(arr, target));
    }

    static int rotatedBS(int[] arr, int target) {
        int peak = pivot(arr);

        if (peak == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        int ans = binarySearch(arr, target, 0, peak);
        if (ans == -1) {
            ans = binarySearch(arr, target, peak + 1, arr.length - 1);
        }

        return ans;
    }

    // peak index in the rotated array is called as pivot
    static int pivot(int[] arr) {
        int s = 0, e = arr.length - 1;

        while(s < e) {
            int m = s + (e - s) / 2;

            if (m < e && arr[m] > arr[m + 1]) {
                return m;
            }
            if (m > s && arr[m] < arr[m - 1]) {
                return m - 1;
            }

            if (arr[m] > arr[s]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s;
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        while(s <= e) {
            int m = s + (e - s) / 2;

            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
