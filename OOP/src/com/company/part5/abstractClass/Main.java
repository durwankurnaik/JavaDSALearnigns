package com.company.part5.abstractClass;

public class Main {

    int num = 69;

    public static void main(String[] args) {
//        Son son = new Son(20);
//        Daughter daughter = new Daughter(24);
//
//        son.career();
//        son.partner();
//
////        System.out.println();
//
//        daughter.career();
//        daughter.partner();
//
////        System.out.println(daughter.age);
////        System.out.println(son.age);
//
        Main obj = new Main();
//        obj.num = 45;
//
////        System.out.println(obj.num);
//        obj.greetings();

        Parent.name();
    }

    void greetings() {
        Main obj = new Main();
        System.out.println(obj.num);
    }
}
