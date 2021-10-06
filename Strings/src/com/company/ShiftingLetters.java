package com.company;

import java.util.Arrays;

public class ShiftingLetters {
    public static void main(String[] args) {
        String s = "ruu";
        int[] shifts = {26, 9, 17};

        System.out.println(shiftingLetters(s, shifts));
    }

    static String shiftingLetters(String s, int[] shifts) {
        char[] sArray = s.toCharArray();
        int[] adding_terms = new int[sArray.length]; // This will hold the numbers to be added in the alphabets.

        // Making use of math and finding out how many numbers required for adding to get the necessary answer.
        for (int i = 0; i < adding_terms.length; i++) {
            for (int j = shifts.length - 1; j >= i; j--) {
                adding_terms[i] += shifts[j];
            }
        }
        // Just in case if the adding_terms becomes more than 26, to bring them back to 26.
        for (int i = 0; i < adding_terms.length; i++){
            if (adding_terms[i] >= 26 && adding_terms[i] < 52) {
                adding_terms[i] -= 26;
            }
            if (adding_terms[i] >= 52 && adding_terms[i] < 78) {
                adding_terms[i] -= 52;
            }
            if (adding_terms[i] >= 78 && adding_terms[i] <= 104) {
                adding_terms[i] -= 78;
            }
            if (sArray[i] + adding_terms[i] > 122) {
                adding_terms[i] = adding_terms[i] - 122 + sArray[i];
                sArray[i] = 96;
            }
        }
        // The above checks will fail for number greater than 104 and more on. This needs to be solved using a loop.

        // Adding the required numbers to the alphabets.
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] += adding_terms[i];
        }
        return String.valueOf(sArray);
    }
}
