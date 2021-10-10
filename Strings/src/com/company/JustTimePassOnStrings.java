package com.company;

import java.util.Arrays;

public class JustTimePassOnStrings {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        reverseArr(arr);
    }

    static void reverseArr(int[] arr) {
        int[] another_arr = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            another_arr[j] = arr[i];
        }

        System.out.println(Arrays.toString(another_arr));
    }
}
