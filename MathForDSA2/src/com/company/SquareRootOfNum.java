package com.company;

public class SquareRootOfNum {
    public static void main(String[] args) {
        System.out.println(sqrt(100));
    }

    static int sqrt(int num) {
        int start = 2, end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid*mid == num) {
                return mid;
            }
            if (mid*mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
