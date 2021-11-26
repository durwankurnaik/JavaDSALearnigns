package com.company.Part7.enums;

public class Enums {
    enum Weekdays {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // These are called enum constants
        // They are declared as public static final
        // Since it's final, you cannot create child enums
        // Type of these constants is week
    }

    public static void main(String[] args) {
        Weekdays week = Weekdays.Friday;

//        System.out.println(week);

        for (Weekdays days: Weekdays.values()) {
            System.out.println(days);
        }
    }
}
