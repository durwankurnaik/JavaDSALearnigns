package com.company;
// https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "Doordarshan";

        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str) {
        if (str.length() == 1) {
            return str;
        }
        char curr = str.charAt(0);
        char next = str.charAt(1);

        if (curr == next) {
            return removeDuplicates(str.substring(1));
        }
        return curr + removeDuplicates(str.substring(1));
    }
}
