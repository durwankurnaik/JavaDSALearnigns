package com.company;
// From GFG

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumArray(arr);
    }

    static void sumArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr));
            arr[i] = arr[i] + arr[i + 1];
        }
    }
}
