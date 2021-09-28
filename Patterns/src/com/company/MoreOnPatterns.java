package com.company;

public class MoreOnPatterns {
    public static void main(String[] args) {
        // The upper pyramid
        for (int row = 5; row >= 1; row--) {
            for (int spaces = 1; spaces <= 5 - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // The lower pyramid
        for (int row = 5; row >= 1; row--) {
            for (int spaces = 4; spaces > 5 - row; spaces--) {
                System.out.print(" ");
            }
            for (int col = row; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
