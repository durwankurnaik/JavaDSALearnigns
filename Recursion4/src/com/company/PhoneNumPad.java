package com.company;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumPad {
    public static void main(String[] args) {
        String nums = "89";
        System.out.println(numpasReturn("", nums));
    }

    static void numpas(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char)('a' + i);
            numpas(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> numpasReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char)('a' + i);
            ans.addAll(numpasReturn(p + ch, up.substring(1)));
        }
        return ans;
    }
}
