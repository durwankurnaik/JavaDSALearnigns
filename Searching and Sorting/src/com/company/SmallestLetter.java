package com.company;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] lets = {'b', 'c', 'e', 'h', 'i', 't'};
        char target = 'a';

        char ceiling = smallestLetter(lets, target);
        System.out.println(ceiling);
    }

    static char smallestLetter(char[] arr, char target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return arr[start % arr.length];
    }
}
