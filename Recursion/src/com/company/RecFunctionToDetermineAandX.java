package com.company;
// Just a normal question from the assignment section, converting the formula to recursive program to find value of x

public class RecFunctionToDetermineAandX {
    public static void main(String[] args) {
        int a = 4, n = 10;

        System.out.println(recAns(a, n, 0));
    }

    static int recAns(int a, int n, int ans) {
        if (a == 1) {
            return ans;
        }
        ans += (int)(Math.log(n) / Math.log(a));
        return recAns(a - 1, n, ans);
    }
}
