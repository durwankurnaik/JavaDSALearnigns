package com.company;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 5};

        sort(arr, arr.length-1, 1, 0 );
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c <= r) {
            // Finding the max element in an array
            if (arr[c] > arr[max]) {
                max = c;
            }
            sort(arr, r, c+1, max);
        } else {
            // swapping the max with last index of array if it is not at the right index. Here, r will be the required last index of the array
            int temp = arr[r]; // doesn't matter if you take (c-1) or r, c will become (r+1) at line 17
            arr[r] = arr[max];
            arr[max] = temp;
            sort(arr, r-1, 0, 0);
        }
    }
}
