// https://leetcode.com/problems/isomorphic-strings

package com.leetcodePractice;

import java.util.Map;
import java.util.LinkedHashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "badc";
        String s2 = "baba";

        System.out.println(isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new LinkedHashMap<>();
        String distS = "", distT = "";

        // If the distinct elements are not equal in both strings, they are not isomorphic
        for (int i = 0; i < s.length(); i++) {
            char letterS = s.charAt(i);
            char letterT = t.charAt(i);

            // using StringBuilder decreases performance and increases memory usage in leetcode
            if (distS.indexOf(letterS) < 0) {
                distS += letterS;
            }
            if (distT.indexOf(letterT) < 0) {
                distT += letterT;
            }
        }

        if (distS.length() != distT.length()) {
            return false;  // here, that condition is checked for distinct equals
        }

        // now checking the mappings of which word was replaced by which element using LinkedHashMap
        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), t.charAt(i));
        }

        // Checking if the changes in string two were correct or not by iterating over strings and checking to there corresponding values
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) != map.get(s.charAt(i))) return false;
        }

        return true;  // if none of the above conditions pass, then the string is isomorphic
    }
}
