package com.company.Part5.abstractClass;

public class Son extends Parent {

    int age;

    public Son(int age) {
        this.age = age;
    }
    public Son() {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love wanda witch");
    }

    public static void main(String[] args) {
        Son son = new Son();
        Parent.name();
        son.oneMoreName();
    }
}
