package com.company.part5.abstractClass;

public abstract class Parent {
    abstract void career();
    abstract void partner();

    static void name() {
        System.out.println("My name is Durwankur Naik");
    }

    void oneMoreName() {
        System.out.println("This is also acceptable since the inherited child class's object will be used to call this method");
    }
}
