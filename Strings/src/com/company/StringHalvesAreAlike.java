package com.company;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/submissions/
// Unsolved...

public class StringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Uo"));
    }

    static boolean halvesAreAlike(String s) {
        char[] sArray = s.toLowerCase().toCharArray();
        String[] a = new String[s.length() / 2], b = new String[s.length() / 2];
        int aCount = 0, bCount = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            a[i] += sArray[i];
        }
        for (int i = 0; i < s.length() / 2; i++) {
            b[i] += sArray[i + (s.length() / 2)];
        }
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (String ans : vowels) {
            for (int i = 0; i < a.length; i++){
                if (a[i].contains(ans)) {
                    aCount++;
                }
                if (b[i].contains(ans)) {
                    bCount++;
                }
            }
        }
        return aCount == bCount;
    }
}

