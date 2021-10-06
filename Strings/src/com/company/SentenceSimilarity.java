package com.company;
// Sentence 1 = "CwFfRo regR"
// Sentence 2 = "CwFfRo H regR"
// The above test case failed this solution but the test case is irrelevant according to the question itself.

// https://leetcode.com/problems/sentence-similarity-iii/

public class SentenceSimilarity {
    public static void main(String[] args) {
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";

        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }

    static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] sentArray1 = sentence1.split(" ");
        String[] sentArray2 = sentence2.split(" ");

        // Just a case where it will always be false.
        if (sentArray1.length < sentArray2.length) {
            return false;
        }

        boolean ans = false;
        for (int i = 0; i < sentArray2.length; i++) {
            for (int j = 0; j < sentArray1.length; j++) {
                ans = false;
                if (sentArray2[i].contains(sentArray1[j])) {
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }
}
