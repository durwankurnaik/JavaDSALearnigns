package com.company;
// This also werks...

public class XorInGivenRange {
    public static void main(String[] args) {
        int start = 2, end = 5;
        System.out.println(xorInRange(start, end));
    }

    static int xorInRange(int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            ans ^= i;
        }
        return ans;
    }
}
