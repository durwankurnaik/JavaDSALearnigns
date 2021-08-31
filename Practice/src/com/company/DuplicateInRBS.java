package com.company;

// Dont know what this question actually meant but it is what it is.
public class DuplicateInRBS {
    public static void main(String[] args) {
        int[] arr = {4,4,5,6,7,0,1,2,3};
        int target = 4;

        System.out.println(duplicate(arr, target));
//        System.out.println(getPivot(arr));
    }

    static int duplicate(int[] arr, int target) {
        int pivot = getPivot(arr);

        if (target == pivot) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Gives you the pivot(largest number) in the Rotated Binary Search.
    static int getPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
