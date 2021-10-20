package com.company;

public class SquareRootOfNum {
    public static void main(String[] args) {
        int num = 40, precision = 3;

        System.out.println(sqrt(num, precision));
    }

    // Complexity : O(log(n))
    static double sqrt(int num, int precision) {
        int start = 2, end = num;
        double root = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid*mid == num) {
                return mid;
            }
            if (mid*mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
                root = mid;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= num) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
