package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 10, 0, 3, 7, 9};
        int count = 1;

        Arrays.sort(arr);

        int[] ans = {arr[0], arr[0]};
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            int curr_count = 1;

            int[] temp_ans = new int[2]; // creating a temp answer array so that every continuous range is monitored
            temp_ans[0] = arr[j];

            while(j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) {
                    curr_count++;
                j++;
            }

            temp_ans[1] = arr[j];
            i = j;

            if (curr_count > count) {
                count = curr_count;
                ans = temp_ans; // here the temp array is stored in answer array if it is the largest range
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
