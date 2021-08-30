package com.company;

public class MissingNumCyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        cyclicSort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}
