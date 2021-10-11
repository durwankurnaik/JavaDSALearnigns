package com.company;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 1, 2, 3, 1, 5, 4, 5};

        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int vals : arr) {
            unique ^= vals;
        }
        return unique;
    }
}
