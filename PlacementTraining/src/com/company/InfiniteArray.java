package com.company;

// Here, if the range exceeds half of the array, it will throw arrayoutofbounndsexception but since we are considering an infinite array, this bug will not even be considered as a bug.
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 14, 15, 19, 22, 27};
        int target = 15;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // finding the range. first starting with a array of size 2
        int start = 0, end = 1;

        while (target > arr[end]) {
            int temp = end + 1;

            // doubling the size of the box
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        while(s <= e) {
            int m = s + (e - s) / 2;

            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
