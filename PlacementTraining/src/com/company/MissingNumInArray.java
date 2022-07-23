package com.company;

public class MissingNumInArray {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(missing(arr));
    }

    public static int missing(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] < arr.length &&  arr[i] != arr[arr[i]]) {
                swap(arr, arr[i], i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
