package com.company;

// Didn't had time to think about this problem.
public class PhineasRecurringTask {
    public static void main(String[] args) {
        System.out.println(conditionChecker("DDBBCCCBBEZ"));
    }

    static boolean conditionChecker(String condition) {
//        int same = 0;
        for (int i = 0; i < condition.length(); i++) {
            int same = 0;
            if (condition.charAt(i) == condition.charAt(i + 1)) {
                same++;
            }
        }

        return false;
    }
}
