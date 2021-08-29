package com.company;
// I was just watching do I still know pivot in RBS or not. the answer is I know.
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {3, 5, 6, 7, 69, 169, 0, 2};

        System.out.println(pivotInRBS(arr));
    }

    static int pivotInRBS(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > end && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            }
            if (arr[mid] > start) {
                end = mid - 1; // This should not be done over here. but start = mid + 1 and vice versa for the else condition.
            } else {
                start = mid + 1;
            }
        }
        return 69;
    }
}
