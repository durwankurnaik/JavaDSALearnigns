package com.company;
// This is the leetcode hard question.
// Solved by me just copy pasting previous examples code, i.e ElementInMountainArray with just removing some code from it.

public class DuplicateElementInRBS {
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4,4,4,4,4,5,6,7,0,1,2,3};
        int target = 4;
        int targetIndexAt = search(arr, target);

        System.out.println(targetIndexAt);
    }

    // This will return the index at which target was found two functions.
    // orderAgnosticBinarySearch() and peakIndexAt() are used.
    // if not found then the answer would be -1 because orderAgnosticBinarySearch() will return it.
    static int search(int[] arr, int target) {
        int pivot = pivotIndexAt(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
//        This is basically my answer to the solution.
//        int firstHalf = binarySearch(arr, target, 0, pivot);
//        if (firstHalf != -1) {
//            return firstHalf;
//        }
//        return binarySearch(arr, target, pivot + 1, arr.length - 1);

//        This is kunal's answer to that question.
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }


    // This will do the ascending binary search, if not found in that, then it will do the descending binary search.
    // If the target is not found in any one the cases, then it will return -1.
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int pivotIndexAt(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if ((arr[end] < arr[end - 1])) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }

        return -1;
    }
}
