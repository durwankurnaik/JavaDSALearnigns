package com.company;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class PhoneNumpadCombination {
    public static void main(String[] args) {
        String nums = "23";
        System.out.println(letterCombinations(nums));
    }

    // Not an optimized solution but it werks
    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return numpad("", digits);
    }

    static List<String> numpad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3 ; i++) {
                char ch = (char)('a' + i);
                ans.addAll(numpad(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3); i++) {
                char ch = (char)('a' + i);
                ans.addAll(numpad(p + ch, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 2; i++) {
                char ch = (char)('a' + i);
                ans.addAll(numpad(p + ch, up.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3 ; i++) {
                char ch = (char)('a' + i);
                ans.addAll(numpad(p + ch, up.substring(1)));
            }
        }
        return ans;
    }

    // This is wrong, I will try the iteration concept later on
    static List<String> letterCombinationsIteration(String p, String up) {
        List<String> ans = new ArrayList<>();
        String ch = "";

        for (int i = 0; i < up.length(); i++) {
            int digit = up.charAt(i) - '0';
            for (int j = (digit - 2) * 3; j < (digit - 1) * 3 ; j++) {
                ch += (char)('a' + i);
                ans.add(ch);
            }
        }
        return ans;
    }
}
