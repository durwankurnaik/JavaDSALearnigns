package com.company;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};

        System.out.println(heightChecker(arr));
    }

    static int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        int count = 0;

        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (heights[j] <= heights[j-1]) {
                    int temp = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp;
                } else {
                    break;
                }
            }
        }

        // Checking the number of indices which do not match the expected array.
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
