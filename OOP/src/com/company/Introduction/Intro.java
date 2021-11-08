package com.company.Introduction;

public class Intro {
    public static void main(String[] args) {
        Students boy = new Students(206, "Durwankur", 88.45f);
        Students girl = new Students(207, "Tulsi", 90.69f);
        Students another_girl = new Students(girl);

        System.out.println(boy.roll_no);
        System.out.println(boy.name);
        System.out.println(boy.marks);
        System.out.println();

        System.out.println(girl.roll_no);
        System.out.println(girl.name);
        System.out.println(girl.marks);
        System.out.println();

        System.out.println(another_girl.roll_no);
        System.out.println(another_girl.name);
        System.out.println(another_girl.marks);
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

    Students () {
        this.roll_no = -1;
        this.name = "Default";
        this.marks = -1f;
    }

    Students (Students other) { // You can pass another constructor for a constructor argument
        this.roll_no = other.roll_no;
        this.name = other.name;
        this.marks = other.marks;
    }
}