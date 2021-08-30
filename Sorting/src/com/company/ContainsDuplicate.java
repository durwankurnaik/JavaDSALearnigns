package com.company;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3 ,1};

        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        // Directly comparing the values.
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

//        Sorting and then at the same time comparing the values.
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if (nums[j] < nums[j-1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//                if (nums[j] == nums[j-1]) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }
}
