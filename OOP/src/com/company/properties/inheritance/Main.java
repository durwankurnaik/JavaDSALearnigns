package com.company.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        BoxWeight obj1 = new BoxWeight(5, 3, 7, 10);
//
//        System.out.println(obj1.l + "  " + obj1.w + "  " + obj1.h + "  " + obj1.weight);
//
//        Something obj2 = new Something("Durwankur");
//        obj2.greetings();

        BoxPrice obj1 = new BoxPrice(6, 3, 7, 10, 100);
        BoxPrice obj2 = new BoxPrice(obj1);
        Box obj3 = new Box(5, 3, 7);
        Box obj4 = new BoxPrice(5, 3, 7, 10, 100);
        Box obj5 = new Box(obj2);

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj4);

        System.out.println(obj5);

    }
}

class Something {
    String name;
    Something(String name) {
        this.name = name;
        System.out.println("Welcome " + name);
    }

    void greetings() {
        System.out.println("Hey there " + name);
    }
}