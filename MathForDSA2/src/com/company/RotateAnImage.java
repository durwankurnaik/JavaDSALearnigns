package com.company;
// https://leetcode.com/problems/rotate-image/

import java.util.Arrays;

public class RotateAnImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        rotate(matrix);
    }

    // This works, but the question asked not to create another array and modify the existing one.
    static void rotation(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix.length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = matrix[i].length - 1, k = 0; j >= 0 ; j--, k++) {
                ans[i][k] = matrix[j][i];
            }
        }
        matrix = ans;
        System.out.println(Arrays.deepToString(matrix));
    }

    // Saw the intuition behind it on the discuss section of leetcode.
    static void rotate(int[][] matrix) {
        // This will find the transpose of the matrix.
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // This will reverse each row in the matrix.
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
