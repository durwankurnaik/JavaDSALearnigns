package com.leetcodePractice;

import java.util.*;

public class TCSNQT {
    public static void main(String[] args) {
//        int[] arr = {4, 4, 4};
//
//        System.out.println(tcsNQTProblem(arr));

        int[] arr = {0, 0, 0, 200, 200, 200};

        System.out.println(problemTwo(arr));
    }

    public static int tcsNQTProblem(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                count++;
            }
        }

        return count == 0 ? count : count + 1;
    }

    public static int problemTwo(int[] arr) {
        LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<>();
        int len = arr.length;
        int count = 1;

        Arrays.sort(arr);

        for (int i = 0; i < len-1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
                lmap.put(arr[i], count);
            } else {
                count = 1;
            }
        }

        System.out.println(lmap);

        int fulfilled = 0;
        int partial = 0;

        for (int num : lmap.values()) {
            if (num == 4) {
                fulfilled++;
                if (fulfilled == 2) {
                    return 0;
                }
            } else {
                partial += num;
            }
        }

        if (partial % 3 == 0 && partial % 2 != 0) {
            return 1;
        } else if (partial % 2 == 0) {
            return 2;
        }

        return 3;
    }
}
