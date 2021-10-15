package com.company;

public class SumOfDigitsOfNumRec {
    public static void main(String[] args) {
        int num = 45632;
        System.out.println(sumOfDigits(num));
    }

    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int remainder = num % 10;
        return sumOfDigits(num / 10) + remainder;
    }
}
