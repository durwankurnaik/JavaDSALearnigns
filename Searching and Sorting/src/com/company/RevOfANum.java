package com.company;

public class RevOfANum {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        String name = "Durwankur";

        for (int i = 0; i < name.length() - 1; i++) {
            System.out.println(name.charAt(i));
        }
    }

    static int reverse(int x) {
        long temp = x, rev_x = 0;

        while (temp != 0) {
            long rem = temp % 10;
            rev_x = (rev_x * 10) + rem;
            temp /= 10;
        }
        System.out.println(rev_x);
        if (rev_x > Math.pow(-2,31) && rev_x < Math.pow(2,31)-1) {
            return (int)rev_x;
        }
        return 0;
    }
}
