package com.company;

import java.util.Arrays;

public class RemovingInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index = 5;

        arr[0] = 43;
        arr[1] = 26;
        arr[2] = 65;
        arr[3] = 69;
        arr[4] = 45;
        arr[5] = 90;
        arr[6] = 9;
        arr[7] = 56;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeAtIndex(arr, index)));
    }

    static int[] removeAtIndex(int[] arr, int index) {

        for (int i = index; i < arr.length; i++) {
            if (i + 1 < arr.length){
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}
