package com.company;

public class NoOfDigitsinBinary {
    public static void main(String[] args) {
        System.out.println(noOfDigitsFormula(16));
    }

    // This method uses the formula method to calculate no of digits.
    static int noOfDigitsFormula(int num) {
        int b = 2; // Here, n is the number whose bits are required by us, and b is the base for the log

        return  (int)(Math.log(num) / Math.log(b)) + 1;
    }

    // This method uses the right shift method to calculate no of digits.
    static int noOfDigitsRightShift(int num) {
        int count = 0;

        while (num > 0) {
            num = num >> 1;
            count++;
        }
        return count;
    }
}
