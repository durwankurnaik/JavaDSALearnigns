package com.company;

public class MirrorReflection {
    public static void main(String[] args) {
        int p = 2, q = 1;

        System.out.println(mirrorReflection(p, q));
    }

    static int mirrorReflection(int p, int q) {
        int x = p;
        int y = q;

        int yDir = 1;

        while (true) {
            if (x == p && y == 0) {
                return 0;
            } else if (x == p && y == p) {
                return 1;
            } else if (x == 0 && y == p) {
                return 2;
            }

            x = p - x; // ping pong from wall to wall
            y = y + q * yDir;
            // fix y position to be within room, update direction if changed
            if (y > p) {
                y = p - (y - p);
                yDir = -1;
            } else if (y < 0) {
                y = -y;
                yDir = 1;
            }
        }
    }
}
