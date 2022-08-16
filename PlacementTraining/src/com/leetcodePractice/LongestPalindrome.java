// https://leetcode.com/problems/longest-palindrome

package com.leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abccccdd";

        System.out.println(longestPalindrome(str));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] letters = s.toCharArray();

        for (char letter : letters) {
            if (map.containsKey(letter)) {
                map.replace(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        int odd = 0;
        int length = 0;

        for (Integer integer : list) {
            if (integer % 2 != 0) {
                length += integer - 1;
                odd = 1;
            } else {
                length += integer;
            }
        }

        return length + odd;
    }
}
