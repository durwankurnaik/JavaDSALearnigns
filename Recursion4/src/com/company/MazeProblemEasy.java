package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class MazeProblemEasy {
    public static void main(String[] args) {
//        path("", 3, 3);
//        System.out.println();
        System.out.println(pathOfMazeDiagonal("", 3, 3));
    }

    static int noOfSteps(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = noOfSteps(r-1, c);
        int right = noOfSteps(r, c-1);
        return left + right;
    }

    // Here, D refers to Down, R to Right and C to cross
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
        }
        if (r > 1) {
            path(p + 'D', r-1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathOfMaze(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathOfMaze(p + 'D', r-1, c));
        }
        if (c > 1) {
            ans.addAll(pathOfMaze(p + 'R', r, c-1));
        }
        return ans;
    }

    // Here you have the option to go down, right and cross(diagonally)
    static ArrayList<String> pathOfMazeDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathOfMazeDiagonal(p + 'D', r-1, c));
        }
        if (r > 1 && c > 1) {
            ans.addAll(pathOfMazeDiagonal(p + 'C', r-1, c-1));
        }
        if (c > 1) {
            ans.addAll(pathOfMazeDiagonal(p + 'R', r, c-1));
        }
        return ans;
    }
}
