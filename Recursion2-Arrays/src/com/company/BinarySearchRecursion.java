package com.company;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 9, 69};
        int target = 4;

        System.out.println(bs(arr, 0, arr.length, target));
    }

    static int bs(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return bs(arr, start, mid - 1, target);
        }
        return bs(arr, mid + 1, end, target);
    }
}
