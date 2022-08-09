package com.leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public char repeatedCharacter(String s) {
        List<Character> list = new ArrayList<>();
        char[] letters = s.toCharArray();

        for(char letter : letters) {
            if (list.contains(letter)) {
                return letter;
            }
            list.add(letter);
        }
        return 'a';
    }
}
