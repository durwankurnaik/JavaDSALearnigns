package com.company;

public class Main {
    public static void main(String[] args) {
        Student durwankur = new Student();

        System.out.println(durwankur.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student () {
        this.rno = 14;
        this.name = "Durwankur Naik";
        this.marks = 91.80f;
    }
}
