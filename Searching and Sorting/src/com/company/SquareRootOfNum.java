package com.company;

public class SquareRootOfNum {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
        System.out.println(Integer.MAX_VALUE);
    }

    static boolean isPerfectSquare(int num) {
        int start = 0, end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid < num) {
                start = mid + 1;
            }
        }
        return false;
    }
}
