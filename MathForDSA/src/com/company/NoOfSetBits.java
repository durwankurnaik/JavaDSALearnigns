package com.company;

public class NoOfSetBits {
    public static void main(String[] args) {
        System.out.println(noOfSets(8));
    }

    static int noOfSets(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
