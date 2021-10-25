package com.company;
// https://leetcode.com/problems/power-of-three/

public class PowerOf3 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
    }

    static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (n % 3 == 0) {
            return isPowerOfThree(n / 3); // Got some help from GFG
        }
        return false;
    }
}
