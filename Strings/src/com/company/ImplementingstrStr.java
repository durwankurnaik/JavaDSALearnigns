package com.company;
// https://leetcode.com/problems/implement-strstr/submissions/
// Its a fanatic problem which doesn't even have any use case according to me.

import java.util.Objects;

public class ImplementingstrStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "mississippi"));
    }

    static int strStr(String haystack, String needle) {
        if (Objects.equals(needle, "")) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }

        boolean ans = true;
        int fin = 0;
        char[] haystackArray = haystack.toCharArray();
        for (int i = 0; i < haystackArray.length; i++) {
            if (haystackArray[i] == needle.charAt(0)) {
                fin = i;
                for (int j = i + 1; j < needle.length(); j++) {
                    ans = true;
                    if (haystackArray[j] != needle.charAt(i)) {
                        ans = false;
                        break;
                    }
                }
                if (ans) {
                    return fin;
                }
            }
        }
        return -1;
    }
}
