package com.company;
// It werks...

public class XorFromZeroToGivenNumber {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(xorTillNum(num));
    }

    static int xorTillNum(int num) {
        int ans = 0;
        for (int i = 0; i <= num; i++) {
            ans ^= i;
        }
        return ans;
    }
}
