package com.company;

public class PasswordChecker {

    public static void main(String[] args) {
        int num = 3;
        String passwd = "Ab1";

        System.out.println(passwordChecker(num, passwd));
    }

    static int passwordChecker(int num, String passwd) {
        int digit = 0, upp = 0, low = 0, special = 0, req = 0;
        for (int i = 0; i < passwd.length(); i++) {
            if (passwd.charAt(i) >= 48 && passwd.charAt(i) <= 57) {
                digit++;
            }
            if (passwd.charAt(i) >= 65 && passwd.charAt(i) <= 90) {
                upp++;
            }
            if (passwd.charAt(i) >= 97 && passwd.charAt(i) <= 122) {
                low++;
            }
            if (passwd.charAt(i) >= 33 && passwd.charAt(i) <= 47 ||
                passwd.charAt(i) >= 58 && passwd.charAt(i) <= 64 ||
                passwd.charAt(i) >= 91 && passwd.charAt(i) <= 96 ||
                passwd.charAt(i) >= 123 && passwd.charAt(i) <= 126) {
                special++;
            }
        }

        if (digit == 0) {
            req++;
        }
        if (upp == 0) {
            req++;
        }
        if (low == 0) {
            req++;
        }
        if (special == 0) {
            req++;
        }

        if (num > 4) {
            return req;
        }
        return req + 6 - (req + num);
    }
}
