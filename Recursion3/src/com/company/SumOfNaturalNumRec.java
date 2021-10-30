package com.company;
// https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/

public class SumOfNaturalNumRec {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(sum(num));
    }

    static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }
}
