package com.company;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cheetah");
        animals.push("Elephant");

        System.out.println(animals);
        animals.pop();
        System.out.println(animals);
    }
}
