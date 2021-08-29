package com.company;

public class MinIn2DArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {32, 23, -66},
                {-12, 11, -54, 69},
                {-23, 53}
        };
        minIn2DArr(arr2d, 32);
    }
    static void minIn2DArr(int arr[][], int target) {
        int min = arr[0][0];
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] == target) {
                    System.out.println("Found the element at row " + rows + " column " + cols);
                }
            }
        }
    }
}
