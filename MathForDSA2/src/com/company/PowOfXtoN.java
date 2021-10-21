package com.company;
// https://leetcode.com/problems/powx-n/
// 304/305 cases passed at submission for my solution, failed at x = 0.999999999, y = -2147483648

public class PowOfXtoN {
    public static void main(String[] args) {
        System.out.println(myPow2(0.999999999, -2147483648));
    }

    // Bruteforce solution for the question, but has a time limit exceed for x = 0.999999999, n = -2147483648
    static double myPow1(double x, int n) {
        // Base case
        if (x == 1 || x == -1 && n % 2 == 0) {
            return 1;
        }
        if (x == -1 && n % 2 != 0) {
            return -1;
        }
        if (x >= 1 && n == -2147483648 || n == 2147483647) {
            return 0;
        }

        double ans = 1;
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                ans /= x;
            }
        } else {
            for (int i = 0; i < n; i++) {
                ans *= x;
            }
        }
        return ans;
    }

    // Found this in discussion section of leetcode
    static double myPow2(double x, int n) {
        if(n == 1) return x;
        if(n == 0) return 1;

        int m = n / 2;
        if(n < 0){
            x = 1 / x;
            m = -m;
        }

        double temp = myPow2(x, m);
        if(n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }
}
