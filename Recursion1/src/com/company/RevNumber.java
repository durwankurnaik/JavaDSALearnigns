package com.company;

public class RevNumber {
    static int ans = 0;
    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        ans = (ans * 10) + (n % 10);
        reverse(n / 10);
    }

    static int rev(int n) {
        if (n % 10 == n) {
            return n;
        }
        int digits = (int)(Math.log10(n)); // Counting the number of digits in that number
        // (int)(Math.log10(n)) + 1, this would give us the no of digits, but we need one less so not adding one in the first place
        // since the no of digits in 123 are 3, we want the last digit of the number i.e 3 to be at the 100's place, so if we do 10 to the power no of digits we will get 10 ^ 3 i.e 1000's place
        // So we need don't need to add 1 in the no of digits formula
        return (n % 10) * (int)Math.pow(10, digits) + rev(n / 10);
    }

    public static void main(String[] args) {
        int num = 696;

//        reverse(num);
//        System.out.println(ans);
        System.out.println(rev(num));
    }
}
