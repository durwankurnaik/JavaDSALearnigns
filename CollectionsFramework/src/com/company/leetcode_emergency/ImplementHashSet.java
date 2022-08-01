package com.company.leetcode_emergency;

public class ImplementHashSet {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();

        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));
    }
}

class MyHashSet {
    private int[] arr;
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public MyHashSet() {
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int key) {
        if (isFull(arr)) {
            increaseSize(arr);
        }

        if (!contains(key)) {
            arr[size++] = key;
        }
    }

    public void remove(int key) {
        size--;
    }

    public boolean contains(int key) {
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public boolean isFull(int[] arr) {
        return size == arr.length;
    }

    public void increaseSize(int[] arr) {
        int[] temp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }
}
