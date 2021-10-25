package com.company;
// https://leetcode.com/problems/power-of-four/

public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (n % 4 == 0) {
            return isPowerOfFour(n / 4); // Got some help from GFG
        }
        return false;
    }
}
