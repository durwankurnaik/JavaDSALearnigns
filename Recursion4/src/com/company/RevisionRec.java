package com.company;

public class RevisionRec {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        queens(board, 0);
    }

    static void knights(boolean[][] board, int row, int col, int target) {
        if (target == 0) {
            displayForKnights(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) { // Final condition of the problem
            return;
        }
        if (col == board.length) {
            knights(board, row + 1, 0, target);
            return;
        }
        if (isSafeForKnights(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, target - 1);
            board[row][col] = false;
        }
        knights(board, row, col + 1, target);
    }

    private static void displayForKnights(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return (row >= 0 && row < board.length) && (col >= 0 && col < board.length);
    }

    private static boolean isSafeForKnights(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    static void queens(boolean[][] board, int row) {
        if (row == board.length) {
            displayForQueens(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafeForQueen(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static void displayForQueens(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafeForQueen(boolean[][] board, int row, int col) {
        // Check vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }

        // Check diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }
}
