package com.company;

public class NoOfZeroes {
    public static void main(String[] args) {
        int num = 609;

        System.out.println(nos(num, 0));
    }

    static int nos(int num, int ans) {
        if (num == 0) {
            return ans;
        }
        if (num % 10 == 0) {
            ans++;
        }
        return nos(num / 10, ans);
    }
}
