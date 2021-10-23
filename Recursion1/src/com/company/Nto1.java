package com.company;

public class Nto1 {

    public static void main(String[] args) {
        int n = 5;

        both1ToandNTo(n);
    }

    static void nto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        nto1(n - 1);
    }

    static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n - 1);
        System.out.print(n + " ");
    }

    static void both1ToandNTo(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        both1ToandNTo(n - 1);
        System.out.print(n + " ");
    }
}
