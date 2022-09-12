//https://leetcode.com/problems/product-of-array-except-self

package com.leetcodePractice;

import java.util.Arrays;

public class ProductArrayOfEachElemExceptSelf {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 0, -4};

        System.out.println(Arrays.toString(getProductArray(arr)));
    }

    public static int[] getProductArray(int[] arr) {
        int mul = 1;
        int zeroes = 0;
        int len = arr.length;

        for (int val : arr) {
            if (val == 0) {
                zeroes++;
            } else {
                mul *= val;
            }
        }

        if (zeroes > 1) {
            arr = new int[len];
        } else if (zeroes == 1) {
            for (int i = 0; i < len; i++) {
                if (arr[i] == 0) {
                    arr[i] = mul;
                } else {
                    arr[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                arr[i] = mul / arr[i];
            }
        }

        return arr;
    }
}
