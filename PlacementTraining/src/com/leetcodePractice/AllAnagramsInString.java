package com.leetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class AllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ansList = new ArrayList<>();
        int lenS = s.length();
        int lenP = p.length();

        for (int i = 0; i <= lenS-lenP; i++) {
            String temp = s.substring(i, i+lenP);
            String pCopy = new String(p);

            for (int j = 0; j < lenP;) {
                int pCopyLen = pCopy.length();
                if (j < pCopyLen && pCopyLen > 0 && pCopy.contains("" + temp.charAt(j))) {
                    pCopy = pCopy.replace("" + pCopy.charAt(j), "");
                } else {
                    j++;
                }
            }

            if (pCopy.length() == 0) {
                ansList.add(i);
            }
        }

        return ansList;
    }
}
