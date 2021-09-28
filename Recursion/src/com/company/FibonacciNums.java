package com.company;

public class FibonacciNums {

    public static void main(String[] args) {
        System.out.println(fibOfNum(7));
    }

    static int fibOfNum(int num) {
        if (num < 2) {
            return num;
        }
        return fibOfNum(num - 1) + fibOfNum(num - 2);
    }
}
