package com.company;
// https://leetcode.com/problems/reverse-string/
// Works on my machine.

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
    }

    static void reverseString(char[] s) {
        System.out.print("[");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print("\"" + s[i] + "\""); // It's specifically formatted to be looked like this.
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
