package com.company;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NoOfSteps {
    public static void main(String[] args) {
        int num = 14;

        System.out.println(nos(num, 0));
    }

    static int nos(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return nos(num / 2, count + 1);
        }
        return nos(num - 1, count + 1);
    }
}
