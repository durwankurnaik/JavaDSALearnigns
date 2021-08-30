package com.company;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

class AllDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        
        // Using cyclic sort for the array.
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            
            if (nums[correctIndex] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        
        // Iterating through the sorted nums array to find the duplicate present in the array.
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}