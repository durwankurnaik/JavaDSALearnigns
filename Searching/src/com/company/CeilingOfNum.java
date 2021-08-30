package com.company;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {-23, -11, -5, -1, 0, 23, 33, 43, 56, 69, 71, 87, 99};
        int target = -25;

        int ceiling = ceilingOfNum(arr, target);
        System.out.println(ceiling);
    }

    static int ceilingOfNum(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[arr.length - 1]) return -1;
            if(target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }

        // If not found, returning -1.
        return start;
    }
}
