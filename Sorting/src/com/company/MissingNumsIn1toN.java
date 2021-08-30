package com.company;

import java.util.ArrayList;

public class MissingNumsIn1toN {
    public static void main(String[] args) {
        int[] arr =  {1,1};

        System.out.println(missing(arr));
    }


    static ArrayList<Integer> missing(int[] arr) {
        cyclicSort(arr);

        ArrayList<Integer> ans_arr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans_arr.add(i + 1);
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
