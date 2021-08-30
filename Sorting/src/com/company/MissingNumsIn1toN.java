package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumsIn1toN {
    public static void main(String[] args) {
        int[] arr =  {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(Arrays.toString(missing(arr)));
    }


    static int[] missing(int[] arr) {
        cyclicSort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                count++;
            }
        }
        int[] ans_arr = new int[count];

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                count++;
                ans_arr[count - 1] = i + 1;
            }
        }
        return ans_arr;
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
