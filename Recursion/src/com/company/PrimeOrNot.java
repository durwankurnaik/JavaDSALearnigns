package com.company;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 67;
        System.out.println(primeOrNot(num, 2));
    }

    static boolean primeOrNot(int num, int divisor) {
        if (num <= 2) {
            return num == 2;
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor*divisor > num) {
            return true;
        }
        return primeOrNot(num, divisor + 1);
    }
}
