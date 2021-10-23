package com.company;

public class PalindromeOfNum {
    public static void main(String[] args) {
        int num = 6996;

        System.out.println(num == rev(num));
    }

    static int rev(int n) {
        if (n % 10 == n) {
            return n;
        }
        int digits = (int)(Math.log10(n)); // Logic covered in RevNumber.java file
        return (n % 10) * (int)Math.pow(10, digits) + rev(n / 10);
    }
}
