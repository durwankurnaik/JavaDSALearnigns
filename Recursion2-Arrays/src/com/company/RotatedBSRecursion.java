package com.company;

public class RotatedBSRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 8;

        System.out.println(rbsUsingRecursion(arr, target, 0, arr.length - 1));
    }

    static int rbsUsingRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rbsUsingRecursion(arr, target, start, mid - 1);
            }
            return rbsUsingRecursion(arr, target, mid + 1, end);
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return rbsUsingRecursion(arr, target, mid + 1, end);
        }
        return rbsUsingRecursion(arr, target, start, mid - 1);
    }
}
