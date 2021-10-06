package com.company;
// https://leetcode.com/problems/valid-palindrome/submissions/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    static boolean isPalindrome(String s) {
        char[] sArray = s.toLowerCase().toCharArray();
        StringBuilder finAns = new StringBuilder();

        for (char vals : sArray) {
            if ((vals >= 97 && vals <= 122) || (vals >= 48 && vals <= 57)) {
                finAns.append(vals);
            }
        }
        return (finAns.toString().equals(finAns.reverse().toString()));
    }
}
