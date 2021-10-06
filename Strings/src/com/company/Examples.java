package com.company;
// https://leetcode.com/problems/sorting-the-sentence/
// Unsolved...

public class Examples {
    public static void main(String[] args) {
        String sent = "is2 a3 sentence5 trial4 This1";
        System.out.println(sortSentence(sent));
    }

    static String sortSentence(String s) {
        String finalAnswer = " ";
        String[] sentence = s.split(" ");

        for (int i = 0; i < sentence.length; i++) {
            for (int j = i; j < sentence.length; j++) {
                if (sentence[j].contains("1")) {
                    finalAnswer += sentence[j];
                }
            }
        }
        return finalAnswer;
    }
}
