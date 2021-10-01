package com.company;
// This is not a efficient algorithm since it takes golden ratio to the power 2 as the time complexity.
public class FibonacciNums {

    public static void main(String[] args) {
//        System.out.println(fibOfNum(6));

//        Iterative Method to solve.
        int num0 = 0, num1 = 1, n = 5, ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = num0 + num1;
            num0 = num1;
            num1 = ans;
        }
        System.out.println(ans);
    }
//    Recursive method to solve.
//    static int fibOfNum(int num) {
//        if (num < 2) {
//            return num;
//        }
//        return fibOfNum(num - 1) + fibOfNum(num - 2);
//    }
}
