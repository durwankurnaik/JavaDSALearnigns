package com.company;

import java.util.Arrays;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
