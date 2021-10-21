package com.company;
// https://leetcode.com/problems/super-pow/
// This doesn't work for some conditions, don't know why

public class SuperPower {
    public static void main(String[] args) {
        int a = 2;
        int[] b = {3};

        System.out.println(superPow(a, b));
    }

    static int superPow(int a, int[] b) {
        int num = 0;
        int ans = 1;
        for (int vals : b) {
            num = vals + (num * 10);
        }
        for (int i = 0; i < num; i++) {
            ans *= a;
        }
        return ans % 1337;
    }
}
