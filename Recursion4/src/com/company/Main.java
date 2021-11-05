package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "i love apple and I also love to make app";

//        System.out.println(skipAppNotApple(str));
        System.out.println((char)(6 + 48));
    }

    static String skip(String str, String ans, int index) {
        if (index == str.length()) {
            return ans;
        }
        if (str.charAt(index) != 'a') {
            ans += str.charAt(index);
        }
        return skip(str, ans, index+1);
    }

    static String skip(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.charAt(0) == 'a') {
            return skip(str.substring(1), ans);
        }
        return skip(str.substring(1), ans + str.charAt(0));
    }

    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip(str.substring(1));
        }
        return ch + skip(str.substring(1));
    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5)); // 5 because to skip the string "apple", we have to provide its length
        }
        return ch + skipApple(str.substring(1));
    }

    static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipApple(str.substring(3));
        }
        return ch + skipAppNotApple(str.substring(1));
    }
}
