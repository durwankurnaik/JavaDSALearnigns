package com.company.leetcode_emergency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) list.add(num);
            else zeroCount++;
        }

        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        Integer[] ans = new Integer[list.size()];
        ans = list.toArray(ans);

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
    }
}
