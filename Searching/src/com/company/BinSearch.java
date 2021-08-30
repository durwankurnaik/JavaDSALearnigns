package com.company;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {845, 254, 32, 11, 9, 6, 4, -1, -42, -54, -69};

        int lin_ans = linearSearch(arr, 4);
        int bin_ans = binarySearch(arr, -69);
        System.out.println(bin_ans);
    }

    // Binary Search, here we come...
    static int binarySearch(int[] arr, int target) {
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

    // Good old Linear search...
    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
