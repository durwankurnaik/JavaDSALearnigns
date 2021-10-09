package com.company;
// Someone's solution on the leetcode discussion section.

public class ShiftingLettersSoln {
    public static void main(String[] args) {
        String s = "mkgfzkkuxownxvfvxasy";
        int[] shifts = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};

        System.out.println(shiftingLetters(s, shifts));
    }

    static String shiftingLetters(String s, int[] shifts) {
        // calculate the total shifts
        for(int i = shifts.length - 1; i > 0; --i){
            shifts[i - 1] += shifts[i]; // add up the shift
            shifts[i - 1] %= 26; // check for integer overflow
        }
        char[] charArr = s.toCharArray();
        for(int i = 0; i < s.length(); ++i){
            charArr[i] = (char)('a' + (charArr[i] - 'a' + shifts[i]) % 26);
        }
        return String.valueOf(charArr);
    }
}
