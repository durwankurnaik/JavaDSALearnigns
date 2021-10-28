package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 6, 2};
        int[] ans = mergeSort(arr);

        System.out.println(Arrays.toString(ans));
    }

    // This function separates the arr and calls the function which will arrange them in correct order
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return sortAndJoin(left, right);
    }

    // This function will actually do the sorting of the given two arrays and joining them in another array
    static int[] sortAndJoin(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        // If one of the array is finished, then the loop will break
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        // In below 2 loops, either of one will run, i.e. the array that still has the elements in it, will run
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}
