package com.leetcodePractice;

import java.util.Arrays;

public class LongestConsecSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1};

        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return len;
        }

        int count = 1;
        int tempCount = 1;
        Arrays.sort(arr);

        for (int i = 1; i < len; i++) {
            if(arr[i]==arr[i-1]) continue;

            else if(arr[i] - 1 != arr[i - 1]) tempCount = 1;

            else{
                tempCount++;
                if(tempCount > count) count = tempCount;
            }
        }

        return count;
    }
}
