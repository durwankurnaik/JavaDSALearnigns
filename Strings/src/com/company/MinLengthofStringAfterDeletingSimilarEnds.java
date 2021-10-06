package com.company;
// I think this should be the fair way to reduce the suffix and prefix but leetcode does in its own way.
// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

public class MinLengthofStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        System.out.println(minimumLength("aabccabba"));
    }

    static int minimumLength(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s);

        int i = 0;
        while (i < str.length() / 2) {
            if (str.charAt(i) == str.charAt(str.length() - 1)) {
                str.deleteCharAt(i);
                str.deleteCharAt(str.length() - 1);
                i = 0;
            } else {
                i++;
            }
        }
        return str.length();
    }
}
