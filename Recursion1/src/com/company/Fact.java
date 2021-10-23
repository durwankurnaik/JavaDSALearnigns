package com.company;

public class Fact {
    public static void main(String[] args) {
        int n = 0;

        System.out.println(fact(n));
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
