package com.company;
// https://leetcode.com/problems/multiply-strings/

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "50";
        String num2 = "50";

        System.out.println(multiply(num1, num2));
    }

    // Found the use of this class on stackoverflow, since this question requires very large integer value around of length 200
    static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger product = n1.multiply(n2);

        return product.toString();
    }
}
