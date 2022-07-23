package com.company;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 6, 4, 2, 1};

        System.out.println(findPeakIndex(arr));
    }

    static int findPeakIndex(int[] arr) {
        int s = 0, e = arr.length;

        while(s < e) {
            int m = s + (e - s) / 2;

            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
}
