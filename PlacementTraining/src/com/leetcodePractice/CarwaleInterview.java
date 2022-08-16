package com.leetcodePractice;

import java.util.Arrays;
import java.util.HashMap;

public class CarwaleInterview {
    public static void main(String[] args) {
        int[] arr = {3, 2, 10, 20, 18};

        System.out.println(Arrays.toString(findNextMax(arr)));
    }

    public static int[] findNextMax(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = arr.length;

        int[] temp = Arrays.copyOf(arr, len);
        int[] ans = new int[len];

        Arrays.sort(temp);

        for (int i = 0; i < len - 1; i++) {
            map.put(temp[i], temp[i+1]);
        }
        map.put(temp[len-1], -1);

        for (int i = 0; i < len; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
