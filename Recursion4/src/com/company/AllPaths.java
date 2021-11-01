package com.company;

import java.util.ArrayList;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        System.out.println(path("", maze, 0, 0));
    }

    static ArrayList<String> path(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (r < maze.length - 1 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(path(p + 'D', maze, r+1, c));
        }
        if (c < maze[0].length - 1 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(path(p + 'R', maze, r, c+1));
        }
        if (r > 0 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(path(p + 'U', maze, r-1, c));
        }
        if (c > 0 && maze[r][c]) {
            maze[r][c] = false;
            ans.addAll(path(p + 'L', maze, r, c-1));
        }
        return ans;
    }
}
