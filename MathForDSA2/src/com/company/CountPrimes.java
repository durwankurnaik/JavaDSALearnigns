package com.company;
// https://leetcode.com/problems/count-primes/

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(primesInRange(5000000));
    }

    // Bruteforce solution but leetcode says time limit exceeded, but it works.
    static int countPrimes(int n) {
        // Base cases
        if (n < 3) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }

        int primenos = 2; // We are not considering 2 and 3 in the loop, so we are calculating them here.
        boolean prime;
        for (int i = 4; i < n; i++) {
            prime = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primenos++;
            }
        }
        return primenos;
    }

    // Sieve of Eratosthenes method
    static int primesInRange(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;

        for (int i = 2; i*i < n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j < n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                count++;
            }
        }
        return count;
    }
}
