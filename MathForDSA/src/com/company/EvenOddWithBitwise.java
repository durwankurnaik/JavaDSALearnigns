package com.company;

public class EvenOddWithBitwise {
    public static void main(String[] args) {
        int num = 3;
        if (isOdd(num)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
