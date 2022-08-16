// https://leetcode.com/problems/contains-duplicate-ii

package com.leetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        int len = nums.length;
//
//        for (int i = 0; i < len; i++) {
//            map.put(i, nums[i]);
//        }
//
//        // passes only 20/52 test cases because of O(n^2) time complexity, but maybe considered as a brute force solution
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                if (i != j && Math.abs(i - j) <= k && Objects.equals(map.get(i), map.get(j))) {
//                    return true;
//                }
//            }
//        }
//
//        return false;

        // code from discuss section on leetcode
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int windowEnd = 0; windowEnd < n; windowEnd++) {
            int element = nums[windowEnd];
            if(map.containsKey(element)){
                int windowStart = map.get(element);
                if((windowEnd - windowStart) <= k) {
                    return true;
                };
            }
            map.put(element, windowEnd);
        }

        return false;
    }
}
