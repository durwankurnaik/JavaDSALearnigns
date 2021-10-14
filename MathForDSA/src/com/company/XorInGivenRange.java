package com.company;
// This also werks...

public class XorInGivenRange {
    public static void main(String[] args) {
        int start = 2, end = 5;
        System.out.println(xorInRange(start, end));

        int ans = noiceSolution(end) - noiceSolution(start - 1);
        System.out.println(ans);
    }

    // Complexity being O(n) for this solution.
    static int xorInRange(int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            ans ^= i;
        }
        return ans;
    }

    // The above solution will give us a TimeLimitExceed for large numbers.
    // Complexity being O(1) for this solution
    static int noiceSolution(int num) {
        if (num % 4 == 0) {
            return num;
        }
        if (num % 4 == 1) {
            return 1;
        }
        if (num % 4 == 2) {
            return num + 1;
        }
        return 0;
    }
}
