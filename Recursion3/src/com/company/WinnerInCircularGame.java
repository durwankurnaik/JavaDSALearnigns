package com.company;
// Leetcode medium, almost solved the problem but getting errors for some test cases

public class WinnerInCircularGame {
    public static void main(String[] args) {
        int n = 8, k = 8;

        System.out.println(findTheWinner(n, k));
    }

    static int findTheWinner(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return winner(arr, k);
    }

    private static int winner(int[] ans, int k) {
        if (ans.length == 1) {
            return ans[0];
        }
        int temp = k;
        while (temp - 1 > ans.length - 1) {
            temp = temp - ans.length - 1;
        }
        return winner(remove(ans, temp), k);
    }

    private static int[] remove(int[] ans, int k) {
        int[] ret_ans = new int[ans.length - 1];

        for (int i = k; i < ans.length - 1; i++) {
            ans[i] = ans[i + 1];
        }
        for (int i = 0; i < ret_ans.length; i++) {
            ret_ans[i] = ans[i];
        }
        return ret_ans;
    }
}
