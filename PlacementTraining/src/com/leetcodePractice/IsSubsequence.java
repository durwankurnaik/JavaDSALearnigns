// https://leetcode.com/problems/is-subsequence

package com.leetcodePractice;

public class IsSubsequence {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";

        System.out.println(isSubsequence(str1, str2));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int idx1 = 0, idx2 = 0, count = 0;
        while (idx1 < s.length() && idx2 < t.length()) {
            if (s.charAt(idx1) == t.charAt(idx2)) {
                idx1++;
                idx2++;
                count++;
                if (count == s.length()) {
                    return true;
                }
            } else {
                idx2++;
            }
        }
        return false;
    }
}
