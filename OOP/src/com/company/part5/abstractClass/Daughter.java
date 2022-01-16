package com.company.Part5.abstractClass;

public class Daughter extends Parent {

    int age;

    public Daughter(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to be Coder");
    }

    @Override
    void partner() {
        System.out.println("I love Thor");
    }
}
