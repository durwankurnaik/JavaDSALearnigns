package com.leetcodePractice;

public class AvailablePermutations {
    public static void main(String[] args) {
        String bigStr = "ooolleoololeh";
        String smallStr = "hello";

        System.out.println(findPermutations(bigStr, smallStr));
    }

    public static int findPermutations(String bigStr, String smallStr) {
        int bigSize = bigStr.length();
        int smallSize = smallStr.length();
        int ans = 0;

        for (int i = 0; i < bigSize - smallSize + 1; i++) {
            String subStr = "" + bigStr.subSequence(i, i + smallSize);
            String small = smallStr;

            for (int j = 0; j < subStr.length(); j++) {
                if (small.contains(subStr.subSequence(j, j+1))) {
                    subStr = subStr.replaceFirst("" + subStr.charAt(j), "");
                    small = small.replaceFirst("" + small.charAt(j), "");
                }
            }

            if (small.length() == 0) {
                ans++;
            }
        }
        return ans;
    }
}
