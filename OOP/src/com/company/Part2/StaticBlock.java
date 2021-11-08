package com.company.Part2;

public class StaticBlock {
    static int a = 4;
    static int b;

    // Will only runs once when first object is created i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
    }
}
