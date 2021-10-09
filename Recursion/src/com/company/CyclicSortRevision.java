package com.company;

import java.util.Arrays;

public class CyclicSortRevision {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3};

        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr) {
        // This type of sorting is only applied to arrays which are like (1, n) or (o, n)
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
