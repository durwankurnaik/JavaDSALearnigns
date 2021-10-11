package com.company;

public class PowerOfNumWithoutBuiltinFunc {
    public static void main(String[] args) {
        int num = 5, pow = 3;
        int ans = 1;

        for (int i = 0; i < pow; i++) {
            ans *= num;
        }
        System.out.println(ans);
    }
}
