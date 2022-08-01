package com.company.leetcode_emergency;

import java.util.Arrays;

public class ValidBoomerang {
    public static void main(String[] args) {
        int[][] arr = {{0, 0},{2, 1},{2, 1}};

        System.out.println(isBoomerang(arr));
    }

    public static boolean isBoomerang(int[][] points) {
        // checks if the points are distinct
        for (int i = 1; i < points.length; i++) {
            if (Arrays.equals(points[i-1], points[i])) {
                return false;
            }

            for (int j = 1; j < points.length; j++) {
                if ((points[j-1][0] == points[j-1][1]) && (points[j][0] == points[j][1])) {
                    return false;
                }
            }
        }

        // checks for the straight line
        for (int j = 1; j < points.length; j++) {
            if ((points[j-1][0] == points[j-1][1]) && (points[j][0] == points[j][1])) {
                return false;
            }
        }
        return true;
    }
}
