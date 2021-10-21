package com.company;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int num = 40;
        boolean[] primes = new boolean[num + 1];

        sieve(num, primes);
    }

    static void sieve(int num, boolean[] primes) {
        // Taking a boolean array whose default values are false by default.
        // Now we know that the second and third number is obviously a prime number, so making their multiples true.
        // In this case, true means not a prime and false means a prime.
        // The math will do the work for itself, just run the loop till num ^ 0.5.
        for (int i = 2; i*i < num; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= num; j+=i) {
                    primes[j] = true;
                }
            }
        }
        // Here, we know that prime indexes have the false value, so we will just return the index of that values.
        for (int i = 2; i <= num; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
