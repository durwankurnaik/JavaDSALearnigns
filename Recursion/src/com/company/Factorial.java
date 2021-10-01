package com.company;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(1));
    }

    static int fact(int num) {
        if (num <= 1) {
            return num;
        }
        return num * fact(num - 1);
    }
}
