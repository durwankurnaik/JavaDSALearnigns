package com.company;

// https://leetcode.com/problems/merge-sorted-array/
import java.util.Arrays;

class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // Adding the nums2 array in the nums1 array on the missing indices of nums1.
        for (int i = 0; i < nums2.length; i++) {
            nums1[i+m] = nums2[i];
        }
        
        // Sorting(Selection Sort) the nums1 array to be equal to the required array.
        for (int i = 0; i < nums1.length; i++) {
            int lastIndex = nums1.length - 1 - i;
            int maxIndex = getMaxIndex(nums1, lastIndex);
            
            // Now swap the lastIndex with the maxIndex.
            int temp = nums1[lastIndex];
            nums1[lastIndex] = nums1[maxIndex];
            nums1[maxIndex] = temp;
        }
        // Program finished here.
    }
    
    static int getMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}