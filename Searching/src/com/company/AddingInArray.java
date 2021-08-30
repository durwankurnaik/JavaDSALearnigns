package com.company;

import java.util.Arrays;

public class AddingInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index = 5, element = 69;

        arr[0] = 43;
        arr[1] = 26;
        arr[2] = 65;
        arr[3] = 69;
        arr[4] = 45;
        arr[5] = 90;
        arr[6] = 9;
        arr[7] = 56;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertElementAtIndex(arr, element, index, arr.length)));
    }

    static int[] insertElementAtIndex(int[] arr, int element, int index, int size) {

        for (int i = size - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;

        return arr;
    }
}
