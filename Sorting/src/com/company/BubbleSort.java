package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // The first loop will cycle through the no of elements the array has.
        // To check if every element will be in the right condition or not.
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // Now this loop will sort the element if they are smaller than their previous ones
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // Very nice check to save time if the array is already sorted
            if (!swapped) {
                break; // The whole loop will break if the array is sorted
            }
        }
    }
}
