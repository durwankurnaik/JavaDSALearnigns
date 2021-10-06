package com.company;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class EquivStrings {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wrd1 = new StringBuilder();
        StringBuilder wrd2 = new StringBuilder();

        // For word 1.
        for (int i = 0; i < word1.length; i++) {
            wrd1.append(word1[i]);
        }
        // For word 2.
        for (int i = 0; i < word2.length; i++) {
            wrd2.append(word2[i]);
        }
        return wrd1.toString().equals(wrd2.toString());
    }
}
