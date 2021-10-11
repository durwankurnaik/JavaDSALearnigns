package com.company;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 32;

        System.out.println((num & (num-1)) == 0);
    }
}
