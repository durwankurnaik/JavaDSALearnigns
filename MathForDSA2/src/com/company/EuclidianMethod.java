package com.company;

public class EuclidianMethod {
    public static void main(String[] args) {
        System.out.println(gcd(16, 34));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    // lcm(a, b) = (a * b) / gcd(a, b)
}
