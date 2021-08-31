package com.company;

// Given that the array is a sorted array.
public class CeilingOfNum {
    public static void main(String[] args) {

    }

    static int ceiling(int[] arr, int target) {
        int ceiling = 0;

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end])
        }

        return ceiling;
    }
}
