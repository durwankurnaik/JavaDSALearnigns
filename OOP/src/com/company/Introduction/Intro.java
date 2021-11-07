package com.company.Introduction;

public class Intro {
    public static void main(String[] args) {
        Students Durwankur = new Students();

        Durwankur.marks = 84.456f;
        Durwankur.name = "Durwankur";
        Durwankur.roll_no = 206;

        System.out.println(Durwankur);
    }
}

class Students {
    int roll_no;
    String name;
    float marks;
}