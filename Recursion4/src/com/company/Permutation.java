package com.company;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
//        System.out.println(permutationReturn("", str));
        System.out.println(permutationCount("", str, 0));
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationReturn(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }

    static int permutationCount(String p, String up, int count) {
        if (up.isEmpty()) {
            return count + 1;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
