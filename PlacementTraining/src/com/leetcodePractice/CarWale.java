package com.leetcodePractice;

import java.util.*;

public class CarWale {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 1, 3));

        int n = 5;

        System.out.println(getMostVisited(n, list));
    }

//    Sarvesh's question
    public static int getMaximumMex(int[] arr, int x) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i+1] += x;
            }
        }
        Arrays.sort(arr);

        if (arr[0] != 0) {
            return 0;
        }
        return arr[arr.length - 1] + 1;
    }

//    Sashwat,s question
    public static int getMostVisited(int n, List<Integer> arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            int start = Math.min(arr.get(i), arr.get(i + 1));
            int end = Math.max(arr.get(i), arr.get(i + 1));

            while (start <= end) {
                map.replace(start, map.get(start) + 1);
                start++;
            }
        }

        int max = Collections.max(map.values());
        int ans = 0;

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == max) {
                ans = it.getKey();
                break;
            }
        }
        return ans;
    }
}
