package com.company.Part3_properties.inheritance;

public class Box {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(BoxWeight other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
    // Above two methods(constructor) are example of method overloading
    // This is an example of static polymorphism or compile time polymorphism

    @Override
    public String toString() {
        return "Box{ " +
                "l = " + l +
                ", w = " + w +
                ", h = " + h +
                " }";
    }
}
