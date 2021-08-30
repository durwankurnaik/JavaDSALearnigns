package com.company;
// Cant find this solution.
public class KthMissingIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};

        System.out.println(findKthPositive(arr, 5));
    }

    static int findKthPositive(int[] arr, int k) {
        int count = 0, poss_ans = 0;
//        for (int i = 1; i < arr[arr.length - 1]; i++) {
//            for (int vals : arr) {
//                if (i != vals) {
//                    poss_ans = i;
//                    count++;
//                    if (count == k) {
//                        return poss_ans;
//                    }
//                    break;
//                }
//            }
//        }
        int i = 1;
        int j = 1;
        while (count != k) {
            if (i != arr[j]) {
                poss_ans = i;
                count++;
                if (count == k) {
                    return poss_ans;
                }
                i++;
                j++;
            }
        }

        return -1;
    }
}
