package com.company;

public class Main {

    public static void main(String[] args) {
        pattern2(4, 0);
    }

    static void pattern2(int row, int cols) { // ascending triangle
        if (row == 0) {
            return;
        }
        if (cols < row) {
            pattern2(row, cols+1);
            System.out.print("*");
        } else {
            pattern2(row-1, 0);
            System.out.println();
        }
    }

    static void pattern1(int row, int cols) { // descending triangle
        if (row == 0) {
            return;
        }
        if (cols < row) {
            System.out.print("*");
            pattern1(row, cols+1);
        } else {
            System.out.println();
            pattern1(row-1, 0);
        }
    }
}
