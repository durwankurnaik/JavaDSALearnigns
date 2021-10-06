package com.company;
// https://leetcode.com/problems/valid-palindrome-ii/
// Nice one, maybe I will solve it later.

public class ValidPalindrome2 {
    public static void main(String[] args) {

    }

    static boolean validPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder temp_str = new StringBuilder();
        str.append(s);
        boolean ans = true;

        if (!str.toString().equals(str.reverse().toString())) {
            for (int i = 0; i < str.length(); i++) {
                str.deleteCharAt(i);
            }
        }
        return ans;
    }
}
