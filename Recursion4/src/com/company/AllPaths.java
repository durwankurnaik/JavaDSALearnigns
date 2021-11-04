package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        int[][] path = new int[maze.length][maze[0].length];

        pathPrint("", maze, path, 0, 0, 1);
    }

    static ArrayList<String> pathRet(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        // Intuition behind Backtracking : Making a change in some value in rec call and undoing it once the rec call has finished executing

        // At the beginning of every rec call, make the value visited as false
        // So that in coming rec calls, the path will be seen as already visited
        // But it should be only valid for that function call
        // So while coming out of the rec calls, undo those changes you have made for that particular rec call

        if (r < maze.length - 1 && maze[r][c]) {
            maze[r][c] = false; // Setting the path as visited
            ans.addAll(pathRet(p + 'D', maze, r+1, c));
            maze[r][c] = true; // Undoing the change since the change needs to be only valid for that particular rec call
        }
        if (c < maze[0].length - 1 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(pathRet(p + 'R', maze, r, c+1));
            maze[r][c] = true;
        }
        if (r > 0 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(pathRet(p + 'U', maze, r-1, c));
            maze[r][c] = true;
        }
        if (c > 0 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(pathRet(p + 'L', maze, r, c-1));
            maze[r][c] = true;
        }
        return ans;
    }

    static void path(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p + " ");
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false; // Changing the value for this and future rec call

        if (r < maze.length - 1) {
            path(p + 'D', maze, r+1, c);
        }
        if (c < maze[0].length - 1) {
            path(p + 'R', maze, r, c+1);
        }
        if (r > 0) {
            path(p + 'U', maze, r-1, c);
        }
        if (c > 0) {
            path(p + 'L', maze, r, c-1);
        }

        maze[r][c] = true; // Undoing the change since rec call is getting over
    }

    static void pathPrint(String p, boolean[][] maze, int[][] path, int r, int c, int steps) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if (r < maze.length - 1) {
            pathPrint(p + 'D', maze, path, r+1, c, steps + 1);
        }
        if (c < maze[0].length - 1) {
            pathPrint(p + 'R', maze, path, r, c+1, steps + 1);
        }
        if (r > 0) {
            pathPrint(p + 'U', maze, path, r-1, c, steps + 1);
        }
        if (c > 0) {
            pathPrint(p + 'L', maze, path, r, c-1, steps + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0; // Not necessary according to me because in the next rec call, path[r][c] = steps will give it the right path number
    }
}
