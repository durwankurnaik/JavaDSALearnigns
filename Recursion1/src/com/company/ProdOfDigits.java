package com.company;

public class ProdOfDigits {
    public static void main(String[] args) {
        int n = 70;

        System.out.println(product(n));
    }

    private static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
