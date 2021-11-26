package com.company.Part6.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{69, 23, 54, 10, 2};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); // This is a shallow copy

//        Making a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
