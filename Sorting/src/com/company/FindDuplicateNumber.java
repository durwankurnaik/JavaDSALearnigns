package com.company;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2};

        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int duplicate = 0;

        // Doing cyclic sort over here.
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[correct] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // Iterating through the array to find the duplicate element.
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                duplicate = arr[i];
            }
        }

        return duplicate;
    }
}
