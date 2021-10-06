package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n) {
        // Time Complexity for this fibonacci numbers is O(1.618 ^ n) where 1.618 is also called as golden ratio.
        return (int)(1 / Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)));
        // The above formula is derived using "Akra Bazzi" Formula which is considered as the best way to derive recurrence relationships.
    }
}
