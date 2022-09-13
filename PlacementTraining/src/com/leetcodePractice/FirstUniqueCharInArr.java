package com.leetcodePractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharInArr {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (charCount.containsKey(s.charAt(i))) {
                charCount.replace(s.charAt(i), charCount.get(s.charAt(i)) + 1);
            } else {
                charCount.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> it : charCount.entrySet()) {
            if ((int) it.getValue() == 1) {
                return s.indexOf((char) it.getKey());
            }
        }

        return -1;
    }
}
