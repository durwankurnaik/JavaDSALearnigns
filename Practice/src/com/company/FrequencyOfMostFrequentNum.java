package com.company;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/
// I think I solved this question but dont know whats the problem, Its failing for one test case.
public class FrequencyOfMostFrequentNum {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int k = 5;

        System.out.println(maxFrequency(arr, k));
    }

    static int maxFrequency(int[] nums, int k) {
        int count = 1;

        // Sorting(Insertion Sort) the array to make it easy to solve the question.
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        // Now iterating through the array to find the answer.
        int max = nums[nums.length - 1]; // The maximum number in the array.
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + k >= max) {
                count++;
            }
        }
        return count;
    }
}
