package com.company;
// This is the worst soln for this problem.

public class ShiftingLetters {
    public static void main(String[] args) {
        String s = "z";
        int[] shifts = {52};
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
        // This solution will work for small numbers for adding_terms but wont work for long terms.
        for (int i = 0; i < adding_terms.length; i++) {
            int numerical_val = adding_terms[i] / 26;
            adding_terms[i] -= numerical_val * 26;

            if (sArray[i] + adding_terms[i] > 122 && sArray[i] + adding_terms[i] < 148) {
                adding_terms[i] = adding_terms[i] + sArray[i] - 122;
                sArray[i] = 96;
            }
        }
        // Adding the required numbers to the alphabets.
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] += adding_terms[i];
        }
        return String.valueOf(sArray);
    }
}
