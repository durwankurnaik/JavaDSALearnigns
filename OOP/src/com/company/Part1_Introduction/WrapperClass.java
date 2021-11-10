package com.company.Part1_Introduction;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 50;

        System.out.println(num);

        A durwankur = new A("Durwankur");

        System.out.println(durwankur.name);

        durwankur = new A("Someone else's Durwankur");

        System.out.println(durwankur.num);
        System.out.println(durwankur.name);

        final A rahul = new A("rahul");
//        rahul = new A("Someone else's rahul"); This can't be done
        rahul.name = "Somewhat different Rahul"; // This can be done because it is a non-primitive data-type

//        Durwankur.num = 15; Can't do this because the int is final in this case
    }
}

class A {
    final int num = 69; // Can't even change the value of num because it is a primitive data-type
    String name;

    public A(String name) {
        this.name = name;
    }
}