package com.company;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {21, 43, -31, -9, 11, 53, 6, 9};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

}
