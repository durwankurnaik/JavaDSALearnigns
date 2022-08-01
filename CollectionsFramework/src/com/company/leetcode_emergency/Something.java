package com.company.leetcode_emergency;

// Partially solved question

import java.util.Arrays;

public class Something {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,3,3,4,5};

        System.out.println(hasGroupsSizeX(nums));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 0 || deck.length == 1) {
            return false;
        }

        Arrays.sort(deck);

        int availableCards = 1; // current number of cards in the group
        int possibleCards = 1; // number of cards other group must have

        for (int j = 0; j < deck.length - 1; j++) {
            if (deck[j] == deck[j+1]) {
                possibleCards++;
            } else {
                break;
            }
        }

        if (possibleCards > 2 && possibleCards % 2 == 0) {
            possibleCards /= 2;
        }

        int i = 0;
        while (i < deck.length - 1) {
            for (int j = 0; j < possibleCards; j++, i++) {
                if (availableCards == possibleCards) {
                    break;
                }

                if (i < deck.length - 1 && deck[i] == deck[i+1]) {
                    availableCards++;
                } else {
                    break;
                }
            }
            if (availableCards != possibleCards) {
                return false;
            }
            availableCards = 1; // resetting the availbleCards so that it can be calculated for next set
            ++i;
        }

        return true;
    }
}
