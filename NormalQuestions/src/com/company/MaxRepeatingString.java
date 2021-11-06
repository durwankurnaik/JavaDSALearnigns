package com.company;

public class MaxRepeatingString {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";

        System.out.println(maxRepeating(sequence, word));
    }

    static int maxRepeating(String sequence, String word) {
//        Don't know why this didn't work for some condition.
//        if (sequence.equals(word)) {
//            return 1;
//        }
//        return nos(sequence, word, 0);

        int count = 0;
        String temp = word;
        while(sequence.contains(temp)) {
            count++;
            temp += word;
        }
        return count;
    }

    static int nos(String sequence, String word, int count) {
        if (sequence.isEmpty()) {
            return count;
        }
        if (sequence.startsWith(word)) {
            return nos(sequence.substring(word.length()), word, count + 1);
        }
        return nos(sequence.substring(1), word, count);
    }
}
