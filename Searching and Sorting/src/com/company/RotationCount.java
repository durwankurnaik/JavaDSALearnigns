package com.company;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, -1, 0, 1, 2};
        int num = pivotIndexAt(arr);

        System.out.println(num + 1);
    }

    static int pivotIndexAt(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
