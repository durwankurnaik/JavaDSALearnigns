package com.company;
// https://leetcode.com/problems/minimum-absolute-difference/
// Leetcode Easy.

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

    }

//    static List<List<Integer>> minimumAbsDifference(int[] arr) {
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//
//        int diff = arr[0] - arr[1];
//        for (int i = 1; i < arr.length; i++) {
//            if (i < arr.length - 1 && diff > arr[i] - arr[i + 1]) {
//                diff = arr[i] - arr[i + 1];
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i < arr.length - 1 && arr[i] - arr[i + 1] == diff) {
//                ans.add();
//            }
//        }
//    }
}
