package com.company;

import java.util.ArrayList;

public class FactorsOfNum {
    public static void main(String[] args) {
        factors(67);
    }

    static void factors(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(num/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
