package com.company.Part2;

public class Singleton {
    private Singleton () {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // Check whether 1 object only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
