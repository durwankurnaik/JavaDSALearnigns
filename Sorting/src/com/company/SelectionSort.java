package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-69, -234, -54, -44, 0, 69, 263, 67};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // This method does the sorting using the Selection Sort Algorithm.
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, lastIndex);

            // Swapping the maximum with the lastIndex element of unsorted part in the array.
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }

    // Finding the maximum number in the array using this method.
    static int getMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
