package com.company;

import java.util.Arrays;

public class MakingTwoArraysEqualByRevSubArrays {
    public static void main(String[] args) {


        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};

        System.out.println(canBeEqual(target, arr));
//        System.out.println(Arrays.toString(arr));
    }

    static boolean canBeEqual(int[] target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
