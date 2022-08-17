package com.leetcodePractice;

import java.util.Set;
import java.util.HashSet;

public class LongestSubstringNonRepeatingChars {
    public static void main(String[] args) {
        String str = "abcdefdefghijkl";

        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0, len = 0, n = s.length();

        for(int i = 0; i < n; i++){
            while(j < n && set.add(s.charAt(j))){
                j++;
            }
            len = Math.max(len, j-i);
            set.remove(s.charAt(i));
        }

        return len;
    }
}
