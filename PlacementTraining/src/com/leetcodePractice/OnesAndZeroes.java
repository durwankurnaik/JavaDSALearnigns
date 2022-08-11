package com.leetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class OnesAndZeroes {
    public static void main(String[] args) {
        String[] val = {"10", "1", "0"};

        System.out.println(findMaxForm(val, 1, 1));
    }

    public static int findMaxForm(String[] strings, int m, int n) {
        List<String> ansList = new ArrayList<>();

        for (String string : strings) {
            int countZeros = countZeros(string);
            int countOnes = string.length() - countZeros;

            if (countOnes < n && countZeros < m) {
                ansList.add(string);
            }
        }

        return ansList.size();
    }

    public static int countZeros(String value) {
        String zerosRemoved = value.replace("0", "");
        return value.length() - zerosRemoved.length();
    }
}
