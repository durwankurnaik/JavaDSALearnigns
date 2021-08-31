package com.company;

// https://leetcode.com/problems/palindrome-number/submissions/
public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(66));
    }

    static boolean isPalindrome(int x) {
        // If negative, they cant be the palindrome nums. Returning false.
        if (x < 0) {
            return false;
        }

        // Reversing the num starts here.
        int rev = 0;
        int temp = x;

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return rev == x; // If reverse num equals to num then true, else false.
    }
}
