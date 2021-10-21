package com.company;
// https://leetcode.com/problems/maximum-69-number/

public class Max69Num {
    public static void main(String[] args) {
        int num = 9669;

        System.out.println(maximum69Number(num));
    }

    // This is literally the worst solution I could think of, but it works.
    // But the solution beats 100% of other java solutions in terms of speed and 80% in terms of memory
    static int maximum69Number(int num) {
        int temp = num, count = 0;
        // Counting the num's length
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] arr = new int[count]; // Creating the array of that length
        // Filling the array with num's numbers
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        // Solving the problem, i.e finding the maximum69Number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 9) {
                arr[i] = 9;
                break;
            }
        }

        // Converting the array to number, don't know of any other solution RN
        int ans = 0;
        for (int j : arr) {
            ans = (ans * 10) + j;
        }
        return ans;
    }
}
