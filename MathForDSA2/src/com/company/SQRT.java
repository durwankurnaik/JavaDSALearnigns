package com.company;

public class SQRT {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    static int mySqrt(int x) {
        int start = 0, end = x;
        int expected_ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2; // long datatype because (mid * mid) might become very long

            if (mid * mid == x) {
                return (int)(mid);
            }
            if (mid * mid < x) {
                expected_ans = (int)(mid);
                start = (int)(mid) + 1;
            } else {
                end = (int)(mid) - 1;
            }
        }
        return (int)(expected_ans);
    }
}
