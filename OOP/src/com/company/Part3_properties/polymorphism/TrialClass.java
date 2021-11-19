package com.company.Part3_properties.polymorphism;

import com.company.Part4_AccessModifiersETC.Main;

public class TrialClass extends Main {
    public TrialClass(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TrialClass obj = new TrialClass("Durwankur");
        System.out.println(obj.name);
    }
}
