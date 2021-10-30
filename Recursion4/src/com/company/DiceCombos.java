package com.company;

import java.util.ArrayList;
import java.util.List;

public class DiceCombos {
    public static void main(String[] args) {
        int num = 4;
        diceCombos("", num);
        System.out.println();
        System.out.println(diceCombosReturn("", num));
    }

    static void diceCombos(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) { // don't know why kunal put i <= 6 when there is i <= target condition in here, so I changed it in the bottom method
            diceCombos(p + i, target - i);
        }
    }

    static List<String> diceCombosReturn(String p, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= target ; i++) {
            ans.addAll(diceCombosReturn(p + i, target - i));
        }
        return ans;
    }
}
