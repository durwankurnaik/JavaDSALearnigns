package com.company;
// This is not a efficient algorithm since it takes golden ratio to the power 2 as the time complexity.
public class FibonacciNums {

    public static void main(String[] args) {
        System.out.println(fibOfNum(6));
    }

    static int fibOfNum(int num) {
        if (num < 2) {
            return num;
        }
        return fibOfNum(num - 1) + fibOfNum(num - 2);
    }
}
