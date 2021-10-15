package com.company;
// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
// I almost solved the question, but saw the answer from GFG.

public class LengthOfString {
    public static void main(String[] args) {
        String str = "Durwankur";

        System.out.println(lengthOfStrRec(str));
    }

    static int lengthOfStrRec(String str) {
        if (str.equals("")) {
            return 0;
        }
        return lengthOfStrRec(str.substring(1)) + 1;
    }
}
