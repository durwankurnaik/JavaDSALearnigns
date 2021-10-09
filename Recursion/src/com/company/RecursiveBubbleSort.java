package com.company;
// I don't know how to do the recursive bubble sort or any kind of sort.

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                swapped = false;
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
