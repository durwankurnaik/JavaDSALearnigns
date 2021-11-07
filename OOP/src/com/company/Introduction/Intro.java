package com.company.Introduction;

public class Intro {
    public static void main(String[] args) {
        Students Durwankur = new Students(206, "Durwankur Naik", 88.45f);
        Students Tulsi = new Students(207, "Harshit Naik", 90.69f);

        System.out.println(Durwankur.roll_no);
        System.out.println(Durwankur.name);
        System.out.println(Durwankur.marks);
        System.out.println();
        System.out.println(Tulsi.roll_no);
        System.out.println(Tulsi.name);
        System.out.println(Tulsi.marks);
    }
}

class Students {
    int roll_no;
    String name;
    float marks;

    Students(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
}