package com.company;
// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {20, 20, 78, 98, 99, 97};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index] > arr[index+1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
}
