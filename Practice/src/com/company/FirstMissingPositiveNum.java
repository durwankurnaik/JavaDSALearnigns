package com.company;

// https://leetcode.com/problems/first-missing-positive/
// Leetcode Hard people.
public class FirstMissingPositiveNum {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {
        // First sorting the array.
        cyclicSort(arr);

        // Iterate through the array to find the missing number.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return -1;
    }

    static void cyclicSort(int[] arr) {
        int start = 0;

        while (start < arr.length) {
            int correct = arr[start] - 1;

            if (arr[start] > 0 && arr[start] <= arr.length - 1 && arr[start] != arr[correct]) {
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            } else {
                start++;
            }
        }
    }
}
