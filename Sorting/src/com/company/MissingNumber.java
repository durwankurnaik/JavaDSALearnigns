package com.company;
// https://leetcode.com/problems/missing-number/
// This werks, and solely done by me. But it's a Easy question.


import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,3,5,8,4,6,1,9,7};

        int missed = missingNumber(arr);
        System.out.println(missed);
    }

    static int missingNumber(int[] arr) {
        sortIt(arr);
        int[] comp_arr = new int[arr.length + 1];

        for (int i = 0; i <= arr.length; i++) {
            comp_arr[i] = i;
        }

        for (int i = 0; i < comp_arr.length; i++) {
            for (int j = i; j < i + 1; j++) {
                if (i < arr.length && comp_arr[i] != arr[j]) {
                    return comp_arr[i];
                }
            }
        }
        return arr[arr.length - 1] + 1;
    }

    static void sortIt(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
