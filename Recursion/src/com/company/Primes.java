package com.company;

public class Primes {
    public static void main(String[] args) {
        int num = 69, count = 1;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                count = 0;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Not a prime");
        } else {
            System.out.println("Is a prime");
        }
    }
}
