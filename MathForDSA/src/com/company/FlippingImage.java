package com.company;
// https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        System.out.println(Arrays.deepToString(flippingImage(arr)));
    }

    // This is the brute-forced approach for this question.
    static int[][] flippingImage(int[][] image) {
        // Flipping and inverting the array at the same time.
        for (int[] rows : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // Swapping the first num with the last number while xor ing them.
                int temp = rows[i] ^ 1;
                rows[i] = rows[image[0].length - i - 1] ^ 1;
                rows[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
