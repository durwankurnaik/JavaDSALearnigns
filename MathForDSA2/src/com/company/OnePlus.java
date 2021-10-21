package com.company;

import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
        int[] arr = {9};

        System.out.println(Arrays.toString(plusOne(arr)));
    }

//    static int[] plusOne(int[] digits) {
//        int[] ans;
//        boolean all_nines = true;
//        for (int vals : digits) {
//            all_nines = false;
//            if (vals == 9) {
//                all_nines = true;
//            }
//        }
//        if (all_nines) {
//            ans = new int[digits.length + 1];
//            ans[0] = 1;
//            for (int i = 1; i < ans.length; i++) {
//                ans[i] = 0;
//            }
//        } else {
//            ans = new int[digits.length];
//            if (digits[digits.length-1] == 9) {
//                digits[digits.length-1]++;
//            } else if ()
//        }
//        return ans;
//    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 1 && digits[0] == 9) {
                    int[] ans_arr = new int[digits.length + 1];
                    Arrays.fill(ans_arr, 0);
                    ans_arr[0] = 1;
                    return ans_arr;
                }
                if (digits.length == 1) {
                    return new int[] {1, 0}; // This solution was not working for 9, so had to create this exception situation
                }
            } else {
                digits[i]++;
                return digits;
            }
        }
        return new int[] {0};
    }
}
