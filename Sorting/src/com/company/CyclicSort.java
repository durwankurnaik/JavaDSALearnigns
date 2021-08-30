package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i] - 1;

            if (arr[correctInd] != arr[i]) {
                int temp = arr[correctInd];
                arr[correctInd] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
