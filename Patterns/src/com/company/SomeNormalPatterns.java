package com.company;

public class SomeNormalPatterns {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern1() {
        for (int rows = 1; rows <= 5; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int rows = 1; rows <= 5; rows++) {
            for (int cols = 1; cols <= 5; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        for (int rows = 1; rows <= 5; rows++) {
            for (int cols = 5; cols >= rows; cols--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        for (int rows = 1; rows <= 5; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
//        for (int rows = 1; rows <= 5; rows++) {
//            for (int cols = 1; cols <= rows; cols++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int rows = 1; rows <= 4; rows++) {
//            for (int cols = 4; cols >= rows; cols--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Another good way to do this...
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row > n ? 2*n - row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row > n ? 2*n - row : row;
            int noOfSpaces = n - totalCols;

            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int i = 0; i < n - row; i++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
//        This is not the optimum way to do this pattern but still it does it's work.
        for (int row = 1; row <= n - 1; row++) {
            for (int i = 0; i < n - row; i++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for (int row = n - 2; row >= 1; row--) {
            for (int i = 0; i < n - row; i++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
