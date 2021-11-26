package com.company.Part6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 1;

        try {
            div(a, b);
        } catch (Exception e) {
            System.out.println("Be careful while operating with numbers");
        }
        finally {
            System.out.println("Always runs");
        }
    }

    static void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }
}
