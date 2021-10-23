package com.company;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 9, 23, 69};
        int target = 69;

//        lsAllIndex(arr, target, 0);
//        System.out.println(ans);

        System.out.println(lsAllIndex2(arr, target, 0));
    }

    static boolean ls(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || ls(arr, target, index + 1);
    }

    static int lsIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
           return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return lsIndex(arr, target, index + 1);
     }

    static ArrayList<Integer> ans = new ArrayList<>();
    static void lsAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            ans.add(index);
        }
        lsAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> lsAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return lsAllIndex(arr, target, index + 1, list);
    }

    // Not optimized solution
    static ArrayList<Integer> lsAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromAllCalls = lsAllIndex2(arr, target, index + 1);

        list.addAll(ansFromAllCalls);

        return list;
    }
}
