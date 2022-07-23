package com.company;

import java.util.Arrays;

public class TwoDimensionArrayBS {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {29, 37, 48, 59},
                {53, 63, 77, 81}
        };
        int target = 10;

        System.out.println(Arrays.toString(searchIn2DArr(arr, target)));
    }

    public static int[] searchIn2DArr(int[][] matrix, int target) {
        int row = 0, col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
