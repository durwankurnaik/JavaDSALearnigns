package com.company;

public class FindithNumber {
    public static void main(String[] args) {
        int num = 10110110;
        int n = 4;

        System.out.println(num & (1 << (n - 1)));
    }
}
