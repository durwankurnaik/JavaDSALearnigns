package com.company;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[correct] != arr[i]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
