package com.company;

public class Timepass {
    public static void main(String[] args) {
        String[] str = {"flower", "flower", "flower", "flower"};

        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder("");
        String query = strs[0];

        for (int i = 0; i < strs[0].length(); i++) {
            str.append(strs[0].charAt(i));

            for (String s : strs) {
                if (!s.startsWith(str.toString())) {
                    return str.deleteCharAt(str.length() - 1).toString();
                }
            }
        }

        return str.toString();
    }
}
