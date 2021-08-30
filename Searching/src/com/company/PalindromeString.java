package com.company;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man10, a plan, a canal: Pa01nama"));
    }

    static boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        String palindrome = "";
        String lowerString = "";

        for(int i = 0; i < s.length(); i++) {
            if((lowerS.charAt(i) >= 'a' && lowerS.charAt(i) <= 'z') || (lowerS.charAt(i) >= '0' && lowerS.charAt(i) <= '9')) {
                lowerString += lowerS.charAt(i);
            }
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            if((lowerS.charAt(i) >= 'a' && lowerS.charAt(i) <= 'z') || ((int)lowerS.charAt(i) >= '0' && (int)lowerS.charAt(i) <= '9')) {
                palindrome += lowerS.charAt(i);
            }
        }
        return lowerString.equals(palindrome);
    }
}
