package com.company;
// Work in progress...

public class JustTImePass {
    public static void main(String[] args) {
        int num = 7;
        int dividable = (int)(Math.sqrt(num));
        System.out.println(recPrimes(2, dividable));
    }

    static boolean recPrimes(int num, int dividable) {
        if (num % dividable == 0) {
            return true;
        } else {
            return recPrimes(num, dividable - 1);
        }
    }
}
