package com.company;
// https://leetcode.com/problems/next-greater-element-i/

import java.util.Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    // Bruteforce solution for this problem
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int ind = 0;
        boolean added;

        for (int value : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                added = false;
                if (value == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j] && ind < ans.length) {
                            ans[ind] = nums2[k];
                            ind++;
                            added = true;
                            break;
                        }
                    }
                    if (!added && ind < ans.length) {
                        ans[ind] = -1;
                        ind++;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}
