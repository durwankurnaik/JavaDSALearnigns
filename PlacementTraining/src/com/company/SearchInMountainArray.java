package com.company;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 10, 13, 17, 12, 8, 3, 1, 0};
        int target = 0;

        System.out.println(searchIndex(arr, target));
    }

    static int searchIndex(int[] arr, int target) {
        int peak = findPeakIndexInMountainArr(arr);

        int ans = orderAgnosticBS(arr, target, 0, peak);
        if (ans == -1) {
            ans = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }

        return ans;
    }

    static int findPeakIndexInMountainArr(int[] arr) {
        int s = 0, e = arr.length - 1;

        while(s < e) {
            int m = s + (e - s) / 2;

            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
