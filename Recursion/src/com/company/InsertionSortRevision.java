package com.company;

import java.util.Arrays;

public class InsertionSortRevision {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(insertionSort(arr));
    }

    static String insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = true;
            for (int j = i + 1; j > 0; j--) {
                swapped = false;
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
                if (!swapped) {
                    break;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
