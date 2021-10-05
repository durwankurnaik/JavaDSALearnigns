package com.company;

// The question asked if the numbers between given range are prime and the difference between them is 2, then they are prime.
public class TwinOrNot {
    public static void main(String[] args) {
        System.out.println(noOfTwins(3, 13));
    }

    static int noOfTwins(int start, int end) {
        int[] primes; // Creating the primes array which will hold the no of primes between the given range.
        int ans_count = 0;

        primes = primesInGivenRange(start, end);

        for (int i = 0; i < primes.length; i++) {
            if (i < primes.length - 1 && primes[i+1] - primes[i] == 2) {
                ans_count++;
            }
        }
        return ans_count;
    }

    static int[] primesInGivenRange(int start, int end) { // Finding the primes in given range.
        int[] primes = new int[(end - start) / 2];
        int flag, count = 0;

        for (int i = start; i <= end; i++) {
            flag = 1; // Lets assume that the number is prime.
            // flag = 1 means number is prime
            // flag = 0 means number is not prime.

            for (int j = 2; j * j <= i; ++j) { // This condition will check if the number is not prime.
                if (i % j == 0) {
                    flag = 0; // Here, our assumption became wrong, so we made number not prime.
                    break; // Here we will stop checking for the current num whether it is prime or not.
                }
            }

            if (flag == 1) {
                primes[count] = i; // Adding number to the primes array since it is a prime number.
                count++;
            }
        }
        return primes;
    }
}
