package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        char[] arr = {'a', 'b', 'c'};

        System.out.println(subSeq(arr));
        System.out.println(subSeqReturn("", str));
    }

    static void subSeq(String processed, String up) {
        if (up.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        char ch = up.charAt(0);

        subSeq(processed + ch, up.substring(1));
        subSeq(processed, up.substring(1));
    }

    static ArrayList<String> subSeqReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReturn(p + ch, up.substring(1));
        ArrayList<String> right = subSeqReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static List<List<Character>> subSeq(char[] arr) {
        List<List<Character>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (char vals : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Character> internal = new ArrayList<>(outer.get(i));
                internal.add(vals);
                outer.add(internal);
            }
        }
        return outer;
    }
}
