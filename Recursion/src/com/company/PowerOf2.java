package com.company;
// https://leetcode.com/problems/power-of-two/

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2147483648));
    }

    static boolean isPowerOfTwo(int n) {
        // Base condition for 0
        if (n == 0) {
            return false;
        }
        if (n == -2147483648) { // don't know why this case is failing
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
