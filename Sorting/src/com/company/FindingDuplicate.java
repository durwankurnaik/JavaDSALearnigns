package com.company;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class FindingDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length-1;) {
            if (nums[i] == nums[i+1]) {
                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = Integer.MIN_VALUE;
            }
            if (nums[i] < nums[i+1]) {
                i++;
                count++;
            } else if (nums[i] > nums[i+1]) {
                break;
            }
        }
        return count;
    }
}
