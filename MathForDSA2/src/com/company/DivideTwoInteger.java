package com.company;
// https://leetcode.com/problems/divide-two-integers/

public class DivideTwoInteger {
    public static void main(String[] args) {
        int dividend = -2147483648, divisor = -1;

        System.out.println(division(dividend, divisor));
    }

    // This works only for positive integers, have to modify it for doing the negative numbers as-well
    static int division(int dividend, int divisor) {
        // Just some starting for the negative numbers

        int isNeg = 0; // If isNeg is 0, then num is negative, else it is positive
        if (dividend < 0) {
            dividend *= -1;
            isNeg ^= 1; // XORing with 1 so 0 changes to 1
        }
        if (divisor < 0) {
            divisor *= -1;
            isNeg ^= 1; // here, 1 will change to 0 so that overall the equation becomes positive
        }

        // Base conditions
        if (dividend == 0) {
            return 0;
        }
        if (isNeg == 0) {
            if (dividend == divisor) {
                return 1;
            }
            if (divisor == 1) {
                return dividend;
            }
        } else {
            if (dividend == divisor) {
                return -1;
            }
            if (divisor == 1) {
                return -dividend;
            }
        }

        // Main program starts from here
        int ans = 0, count = 0;
        while (ans < dividend) {
            ans += divisor;
            count++;
        }
        count--;
        return count;
    }
}
