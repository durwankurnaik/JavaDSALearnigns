package com.company;

import java.util.Arrays;

public class SelectionSortRevision {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 0, 6, 4, 8, -21, 44};

        System.out.println(selectionSort(arr));
    }

    static String selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxNum(arr, lastIndex);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
        return Arrays.toString(arr);
    }

    static int getMaxNum(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
