package com.leetcodePractice;

public class RecursionDepthTesting {
    public static void main(String[] args) {
        int limit = 100000;  // does not run at this limit
        System.out.println(doItRecursively(limit));
    }

    public static int doItRecursively(int num) {
        if (num == 1) {
            return 1;
        }
        return doItRecursively(num - 1);
    }
}
